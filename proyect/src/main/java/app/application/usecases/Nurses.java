
package app.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.services.SearchPatient;


@Service
public class Nurses {
    
    @Autowired
    private SearchPatient searchPatient;
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
}
