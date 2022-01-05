package pet.clinic.sfg.service;

import pet.clinic.sfg.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner getByLastName(String lastName);

    Owner getById(Long id);

    void save(Owner owner);

    Set<Owner> getAll();
}
