package app.domain.model;


public class Medication extends Order{
    public String duration;    

    public Medication(String dosage, int orderNumber, int medicationId, Double cost) {
        super(dosage, orderNumber, medicationId, cost);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
