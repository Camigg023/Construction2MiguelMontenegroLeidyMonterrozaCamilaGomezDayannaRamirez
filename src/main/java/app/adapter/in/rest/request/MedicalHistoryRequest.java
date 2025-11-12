package src.main.java.app.adapter.in.rest.request;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data

public class MedicalHistoryRequest {
    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotBlank(message = "La queja principal es obligatoria")
    @Size(max = 250, message = "La queja principal no puede superar 250 caracteres")
    private String chiefComplaint;

    @Size(max = 500, message = "Los síntomas no pueden superar 500 caracteres")
    private String symptoms;

    @Size(max = 500, message = "El diagnóstico no puede superar 500 caracteres")
    private String diagnosis;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "La fecha es obligatoria")
    private Date date;

    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnostics;

    @Size(max = 500, message = "Las observaciones no pueden superar 500 caracteres")
    private String observations;
}