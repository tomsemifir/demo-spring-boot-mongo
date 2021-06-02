package fr.semifir.demospring.services.impl;

import fr.semifir.demospring.models.Moteur;
import fr.semifir.demospring.models.Voiture;
import fr.semifir.demospring.repositories.MoteurRepository;
import fr.semifir.demospring.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MoteurServiceImpl implements GenericService<Moteur> {

    @Autowired
    private MoteurRepository moteurRepository;

    @Override
    public List<Moteur> getAll() {
        return this.moteurRepository.findAll();
    }

    @Override
    public Moteur getById(String id) {
        return this.moteurRepository.findById(id).get();
    }

    @Override
    public Moteur create(Moteur entity) {
        return this.moteurRepository.save(entity);
    }

    @Override
    public Moteur update(Moteur entity) {
        return this.moteurRepository.save(entity);
    }

    @Override
    public void delete(String id) {
        this.moteurRepository.deleteById(id);
    }
}
