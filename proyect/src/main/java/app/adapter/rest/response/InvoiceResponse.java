package src.main.java.app.adapter.rest.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder

public class InvoiceResponse {
    private Long invoiceId;
    private Date date;
    private Double totalCost;
    private boolean coveredByInsurance;
    private Double copay;
    private Double insuranceCoverageAmount;
    private Double patientCharge;
}