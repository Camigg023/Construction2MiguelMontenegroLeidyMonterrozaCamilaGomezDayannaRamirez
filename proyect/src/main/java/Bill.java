
public class Bill extends Patient{
  private String patientName;   
  private String doctorName;  
  private String insuranceName;  
  private String policyNumber;   
  private Int InvoiceId;  
  private Int patientId; 
  private Int age; 
  private Date policyStartDate; 
  private Date policyEndDate; 
  private Double cost; 

    public Bill(String patientName, String doctorName, String insuranceName, String policyNumber, Int InvoiceId, Int patientId, Int age, Date policyStartDate, Date policyEndDate, Double cost) {
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

    public Int getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(Int InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public Int getPatientId() {
        return patientId;
    }

    public void setPatientId(Int patientId) {
        this.patientId = patientId;
    }

    public Int getAge() {
        return age;
    }

    public void setAge(Int age) {
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
