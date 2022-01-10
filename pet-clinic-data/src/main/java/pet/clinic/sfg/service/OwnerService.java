package pet.clinic.sfg.service;

import pet.clinic.sfg.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner getByLastName(String lastName);

}
