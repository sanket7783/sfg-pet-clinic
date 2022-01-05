package pet.clinic.sfg.service;

import pet.clinic.sfg.model.Vet;

import java.util.Set;

public interface VetService {

    Vet getById(Long id);

    void save();

    Set<Vet> getAll();
}
