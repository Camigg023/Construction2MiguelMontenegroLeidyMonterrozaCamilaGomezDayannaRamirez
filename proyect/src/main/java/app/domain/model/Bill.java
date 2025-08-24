package app.domain.model;

import java.util.Date;


public class Bill{
  
  private User doctor;  
  private MedicalInsurance medicalInsurance;    
  private Patient patient;
  private Medication medicine;
  private long InvoiceId;
  private boolean medication;
  private Double cost; 
  private Date date;

    public Bill( Patient patient, User doctor, MedicalInsurance medicalInsurance, long InvoiceId, Double cost, boolean medication, Date date) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicalInsurance = medicalInsurance;
        this.InvoiceId = InvoiceId;
        this.cost = cost;
        this.medication = medication;
        this.date = date;
        this.medicine = medicine;
    }

    
    public User getDoctor() {
        return doctor;
    }

    
    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    
    public MedicalInsurance getMedicalInsurance() {
        return medicalInsurance;
    }

    
    public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    
    public long getInvoiceId() {
        return InvoiceId;
    }

    
    public void setInvoiceId(long InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    
    public Patient getPatient() {
        return patient;
    }

    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    public Double getCost() {
        return cost;
    }

    
    public void setCost(Double cost) {
        this.cost = cost;
    }

    
    public boolean isMedication() {
        return medication;
    }

    
    public void setMedication(boolean medication) {
        this.medication = medication;
    }

    
    public Date getDate() {
        return date;
    }

   
    public void setDate(Date date) {
        this.date = date;
    }

    
    public Medication getMedicine() {
        return medicine;
    }

    
    public void setMedicine(Medication medicine) {
        this.medicine = medicine;
    }
    
    
    
    

    
}
