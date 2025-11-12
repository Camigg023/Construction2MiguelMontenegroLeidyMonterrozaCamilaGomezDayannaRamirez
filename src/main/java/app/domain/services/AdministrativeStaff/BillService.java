package src.main.java.app.domain.services.AdministrativeStaff;

import src.main.java.app.domain.model.*;

public class BillService {

    public Bill calculateBill(Bill bill) {
        double total = 0;

        if (bill.getMedications() != null)
            total += bill.getMedications().stream()
                    .mapToDouble(OrderMedication::getCost)
                    .sum();

        if (bill.getProcedures() != null)
            total += bill.getProcedures().stream()
                    .mapToDouble(OrderProcedure::getCost)
                    .sum();

        if (bill.getDiagnosticTests() != null)
            total += bill.getDiagnosticTests().stream()
                    .mapToDouble(OrderDiagnosticTest::getCost)
                    .sum();

        bill.setTotalCost(total);


        if (bill.isCoveredByInsurance()) {
            bill.setCopay(50000.0);
            bill.setInsuranceCoverageAmount(total - bill.getCopay());
            bill.setPatientCharge(bill.getCopay());
        } else {
            bill.setCopay(0.0);
            bill.setInsuranceCoverageAmount(0.0);
            bill.setPatientCharge(total);
        }

        return bill;
    }
}

