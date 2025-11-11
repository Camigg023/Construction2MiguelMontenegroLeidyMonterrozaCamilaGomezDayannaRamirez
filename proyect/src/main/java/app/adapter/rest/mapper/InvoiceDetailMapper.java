package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.BillRequest;
import app.adapter.in.rest.response.BillResponse;
import app.domain.model.Bill;
import lombok.experimental.UtilityClass;

@UtilityClass

public class InvoiceDetailMapper {
    public Bill toDomain(BillRequest request) {
        Bill bill = new Bill();
        bill.setDate(request.getDate());
        bill.setTotalCost(request.getTotalCost());
        bill.setCoveredByInsurance(request.isCoveredByInsurance());
        bill.setCopay(request.getCopay());
        bill.setInsuranceCoverageAmount(request.getInsuranceCoverageAmount());
        bill.setPatientCharge(request.getPatientCharge());
        bill.setPatient(request.getPatient());
        bill.setDoctor(request.getDoctor());
        bill.setMedicalInsurance(request.getMedicalInsurance());
        bill.setVisit(request.getVisit());
        bill.setMedications(request.getMedications());
        bill.setProcedures(request.getProcedures());
        bill.setDiagnosticTests(request.getDiagnosticTests());
        bill.setItem(request.getItem());
        return bill;
    }

    public BillResponse toResponse(Bill bill) {
        return BillResponse.builder()
                .invoiceId(bill.getInvoiceId())
                .date(bill.getDate())
                .totalCost(bill.getTotalCost())
                .coveredByInsurance(bill.isCoveredByInsurance())
                .copay(bill.getCopay())
                .insuranceCoverageAmount(bill.getInsuranceCoverageAmount())
                .patientCharge(bill.getPatientCharge())
                .patient(bill.getPatient())
                .doctor(bill.getDoctor())
                .medicalInsurance(bill.getMedicalInsurance())
                .visit(bill.getVisit())
                .medications(bill.getMedications())
                .procedures(bill.getProcedures())
                .diagnosticTests(bill.getDiagnosticTests())
                .item(bill.getItem())
                .build();
    }
}