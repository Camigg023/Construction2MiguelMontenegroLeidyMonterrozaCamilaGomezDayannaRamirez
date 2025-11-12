package src.main.java.app.domain.model;


public class Specialty {

    private long idSpeciality;
    private String name;
    private String description;


    public Specialty() {}


    public Specialty(long idSpeciality, String name, String description) {
        this.idSpeciality = idSpeciality;
        this.name = name;
        this.description = description;
    }


    public long getIdSpeciality() {
        return idSpeciality;
    }

    public void setIdSpeciality(long idSpeciality) {
        this.idSpeciality = idSpeciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

