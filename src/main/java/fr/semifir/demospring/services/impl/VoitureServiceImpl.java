package fr.semifir.demospring.services.impl;

import fr.semifir.demospring.models.Moteur;
import fr.semifir.demospring.models.Voiture;
import fr.semifir.demospring.repositories.VoitureRepository;
import fr.semifir.demospring.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VoitureServiceImpl implements GenericService<Voiture> {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private GenericService<Moteur> moteurService;

    @Override
    public List<Voiture> getAll() {
        return this.voitureRepository.findAll();
    }

    @Override
    public Voiture getById(String id) {
        Voiture v = this.voitureRepository.findById(id).get();
        v.setMoteur(this.moteurService.getById(v.getMoteur().getId()));
        return v;
    }

    @Override
    public Voiture create(Voiture voiture) {
        return this.voitureRepository.save(voiture);
    }

    @Override
    public Voiture update(Voiture voiture) {
        return this.voitureRepository.save(voiture);
    }

    @Override
    public void delete(String id) {
        this.voitureRepository.deleteById(id);
    }
}
