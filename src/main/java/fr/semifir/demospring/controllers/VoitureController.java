package fr.semifir.demospring.controllers;

import fr.semifir.demospring.models.Voiture;
import fr.semifir.demospring.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("voitures")
public class VoitureController {

    @Autowired
    private GenericService<Voiture> voitureService;

    @GetMapping()
    public List<Voiture> getAll() {
        return this.voitureService.getAll();
    }

    @GetMapping("{id}")
    public Voiture getById(@PathVariable String id) {
        return this.voitureService.getById(id);
    }

    @PostMapping()
    public Voiture create(@RequestBody Voiture voiture) {
        return this.voitureService.create(voiture);
    }

    @PatchMapping()
    public Voiture update(@RequestBody Voiture voiture) {
        return this.voitureService.update(voiture);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.voitureService.delete(id);
    }
}
