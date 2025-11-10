package src.main.java.app.domain.services.InformationSupport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.Inventory;
import src.main.java.app.domain.ports.InventoryPort;

@Service
public class InventoryService {

    @Autowired
    private InventoryPort inventoryPort;


    public void addItemToInventory(Inventory inventory) throws BusinessException {
        if (inventory == null) {
            throw new BusinessException("El inventario no puede ser nulo.");
        }

        if (inventory.getName() == null || inventory.getName().isEmpty()) {
            throw new BusinessException("El inventario debe tener un nombre válido.");
        }

        if (inventory.getStatus() == null || inventory.getStatus().isEmpty()) {
            throw new BusinessException("El inventario debe tener un estado definido (activo, en revisión, inactivo).");
        }

        inventoryPort.save(inventory);
    }


    public void updateItemStock(int inventoryId, int newQuantity) throws BusinessException {
        if (newQuantity < 0) {
            throw new BusinessException("La cantidad no puede ser negativa.");
        }

        Inventory existingInventory = inventoryPort.findById(inventoryId);
        if (existingInventory == null) {
            throw new BusinessException("No se encontró el inventario con el ID especificado.");
        }

        inventoryPort.update(existingInventory);
    }


    public List<Inventory> getInventory() {
        return inventoryPort.findAll();
    }
}
