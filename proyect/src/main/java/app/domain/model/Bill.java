package app.domain.model;

import java.util.Date;
public class Bill{
  private String patientName;   
  private String doctorName;  
  private String insuranceName;  
  private String policyNumber;   
  private int InvoiceId;  
  private int patientId; 
  private int age; 
  private Date policyStartDate; 
  private Date policyEndDate; 
  private Double cost; 

    public Bill(String patientName, String doctorName, String insuranceName, String policyNumber, int InvoiceId, int patientId, int age, Date policyStartDate, Date policyEndDate, Double cost) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.insuranceName = insuranceName;
        this.policyNumber = policyNumber;
        this.InvoiceId = InvoiceId;
        this.patientId = patientId;
        this.age = age;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.cost = cost;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(int InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
