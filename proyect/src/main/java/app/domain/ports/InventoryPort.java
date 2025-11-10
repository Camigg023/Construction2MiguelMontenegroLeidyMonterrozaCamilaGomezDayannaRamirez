package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.Inventory;

public interface InventoryPort {

    Inventory save(Inventory inventory);
    Inventory update(Inventory inventory);
    Inventory findById(int id);
    List<Inventory> findAll();
}

