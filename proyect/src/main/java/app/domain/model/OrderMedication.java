package app.domain.model;


public class OrderMedication extends Order{
    
    private int idMedication;
    private String dosage;
    private String duration;  
    private int item;

    public OrderMedication(int idMedication, String dosage, String duration, int item, long orderNumber, User doctor, Patient patient) {
        super(orderNumber, doctor, patient);
        this.idMedication = idMedication;
        this.dosage = dosage;
        this.duration = duration;
        this.item = item;
    }

    
    public int getIdMedication() {
        return idMedication;
    }

    
    public void setIdMedication(int idMedication) {
        this.idMedication = idMedication;
    }

    
    public String getDosage() {
        return dosage;
    }

   
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    
    public String getDuration() {
        return duration;
    }

 
    public void setDuration(String duration) {
        this.duration = duration;
    }

    
    public int getItem() {
        return item;
    }

    
    public void setItem(int item) {
        this.item = item;
    }
    
    
    
    

    
}
