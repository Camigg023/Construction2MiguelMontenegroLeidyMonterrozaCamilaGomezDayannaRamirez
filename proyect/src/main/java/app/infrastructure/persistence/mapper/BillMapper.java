package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.Bill;
import src.main.java.app.infrastructure.persistence.entities.BillEntity;

public class BillMapper {

    public static BillEntity toEntity(Bill bill) {
        if (bill == null) return null;

        BillEntity entity = new BillEntity();

        entity.setInvoiceId(bill.getInvoiceId());
        entity.setDoctor(bill.getDoctor());
        entity.setMedicalInsurance(bill.getMedicalInsurance());
        entity.setPatient(bill.getPatient());
        entity.setMedicine(bill.getMedicine());
        entity.setMedication(bill.isMedication());
        entity.setCost(bill.getCost());
        entity.setDate(bill.getDate());

        return entity;
    }

    public static Bill toDomain(BillEntity entity) {
        if (entity == null) return null;

        Bill bill = new Bill();

        bill.setInvoiceId(entity.getInvoiceId());
        bill.setDoctor(entity.getDoctor());
        bill.setMedicalInsurance(entity.getMedicalInsurance());
        bill.setPatient(entity.getPatient());
        bill.setMedicine(entity.getMedicine());
        bill.setMedication(entity.isMedication());
        bill.setCost(entity.getCost());
        bill.setDate(entity.getDate());

        return bill;
    }
}

