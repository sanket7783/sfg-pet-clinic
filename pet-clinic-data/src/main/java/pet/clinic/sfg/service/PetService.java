package pet.clinic.sfg.service;

import pet.clinic.sfg.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    void save();

    Set<Pet> findAll();
}
