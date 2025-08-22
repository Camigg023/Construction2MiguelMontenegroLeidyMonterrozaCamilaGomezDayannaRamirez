
package app.domain.ports;

import app.domain.model.Order;

public interface OrderPort {
    public Order FindbyOrderNumber (Order order) throws Exception;
    public Order FindbyMedicationId (Order order) throws Exception;
        public void save (Order order) throws Exception;
    
}
