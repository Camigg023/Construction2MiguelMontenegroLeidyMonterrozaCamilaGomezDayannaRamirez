package app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class EmergencyContact {
    
    @Id
    private int phone;
    
    private String name; 
    private String relationShip; 
     
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
