package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.Bill;
import java.util.List;

public interface BillPort {
    void save(Bill bill) throws Exception;
    Bill findById(Long id) throws Exception;
    List<Bill> findAll() throws Exception;
    void update(Bill bill) throws Exception;
    void delete(Long id) throws Exception;
}




