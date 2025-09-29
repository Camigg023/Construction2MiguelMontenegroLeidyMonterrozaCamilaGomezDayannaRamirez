package app.domain.model;



import java.sql.Date; 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class MedicalInsurance {
    
    @Id
    private String policyNumber;
            
    private String company;
    private Date validity;
    private Boolean status;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        
        this.status = status;
    }
}
