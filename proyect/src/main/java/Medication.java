
public class Medication extends Order{
    public String duration;

    public Medication(String duration,String dosage, Double cost) {
        super(dosage, cost);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
