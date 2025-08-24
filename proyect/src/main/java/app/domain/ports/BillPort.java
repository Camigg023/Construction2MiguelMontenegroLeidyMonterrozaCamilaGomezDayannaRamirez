
package app.domain.ports;

import app.domain.model.Bill;




public interface BillPort {
    
    public void save (Bill bill) throws Exception;
        
}

