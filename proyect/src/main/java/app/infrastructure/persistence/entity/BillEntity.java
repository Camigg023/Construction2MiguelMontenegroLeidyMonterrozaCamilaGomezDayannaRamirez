
package app.infrastructure.persistence.entity;

import app.domain.model.MedicalInsurance;
import app.domain.model.OrderMedication;
import app.domain.model.Patient;
import app.domain.model.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "bills")
public class BillEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "invoice_id", updatable = false, nullable = false)
  private long InvoiceId;
   
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "doctor_id", nullable = false)
  private User doctor;  
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "medical_insurance_id")
  private MedicalInsurance medicalInsurance;
          
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "patient_id", nullable = false)
  private Patient patient;
  
  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "order_medication_id")
  private OrderMedication medicine;  
  
  @Column(name = "has_medication", nullable = false)
  private boolean medication;
  
  @Column(name = "cost", nullable = false, precision = 12, scale = 2)
  private Double cost; 
  
  @Column(name = "created_at", nullable = false)
  private Date date;

    public long getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(long InvoiceId) {
        this.InvoiceId = InvoiceId;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public OrderMedication getMedicine() {
        return medicine;
    }

    public void setMedicine(OrderMedication medicine) {
        this.medicine = medicine;
    }

    public boolean isMedication() {
        return medication;
    }

    public void setMedication(boolean medication) {
        this.medication = medication;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
  
  
}
