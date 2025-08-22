
package app.domain.ports;

import app.domain.model.Bill;
import app.domain.model.Patient;
import app.domain.model.User;



public interface BillPort {
    public User findByIdentification (User user) throws Exception; 
    public Patient findByPatientId (Patient patient) throws Exception; 
    public Bill findByInvoiceid (Bill bill) throws Exception; 
    public Patient findByPolicyNumber (Patient patient) throws Exception; 
        public void save (User user) throws Exception;
        public void save (Bill bill) throws Exception;
        public void save (Patient patient) throws Exception;
}

