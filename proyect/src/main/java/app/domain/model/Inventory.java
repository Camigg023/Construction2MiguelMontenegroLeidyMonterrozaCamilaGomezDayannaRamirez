package app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Inventory {
    
  @Id
   private int id;
   private List medications;
   private List procedures;
   private List diagnosticTests;
   
   public int getId() {
       return id;
   }
   
   public void setId(int id) {
        this.id = id;
    }

   
    public List getMedications() {
        return medications;
    }

    public void setMedications(List medications) {
        this.medications = medications;
    }

    public List getProcedures() {
        return procedures;
    }

    public void setProcedures(List procedures) {
        this.procedures = procedures;
    }

    public List getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(List diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }
   
}
