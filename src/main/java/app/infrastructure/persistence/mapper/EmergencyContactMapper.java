
package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.EmergencyContact;
import src.main.java.app.infrastructure.persistence.entities.EmergencyContactEntity;

public class EmergencyContactMapper {

    public static EmergencyContactEntity toEntity(EmergencyContact contact) {
        if (contact == null) return null;

        EmergencyContactEntity entity = new EmergencyContactEntity();

        entity.setPhone(contact.getPhone());
        entity.setName(contact.getName());
        entity.setRelationShip(contact.getRelationShip());

        return entity;
    }

    public static EmergencyContact toDomain(EmergencyContactEntity entity) {
        if (entity == null) return null;

        EmergencyContact contact = new EmergencyContact();

        contact.setPhone(entity.getPhone());
        contact.setName(entity.getName());
        contact.setRelationShip(entity.getRelationShip());

        return contact;
    }
}
