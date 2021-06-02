package fr.semifir.demospring.controllers;

import fr.semifir.demospring.models.Moteur;
import fr.semifir.demospring.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("moteurs")
public class MoteurController {

    @Autowired
    private GenericService<Moteur> moteurService;

    @GetMapping()
    public List<Moteur> getAll() {
        return this.moteurService.getAll();
    }

    @GetMapping("{id}")
    public Moteur getById(@PathVariable String id) {
        return this.moteurService.getById(id);
    }

    @PostMapping()
    public Moteur save(@RequestBody Moteur moteur) {
        return this.moteurService.create(moteur);
    }

    @PatchMapping()
    public Moteur update(@RequestBody Moteur moteur) {

        return this.moteurService.update(moteur);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.moteurService.delete(id);
    }
}
