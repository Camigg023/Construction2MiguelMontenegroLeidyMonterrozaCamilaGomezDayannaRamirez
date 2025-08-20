
public class MedicalHistory {
    private String chiefComplaint;
    private String symptoms;
    private String diagnosis;
    private Int medicalId;
    private Date date;

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Int medicalId) {
        this.medicalId = medicalId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
