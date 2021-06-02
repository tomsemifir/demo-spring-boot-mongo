package fr.semifir.demospring.repositories;

import fr.semifir.demospring.models.Moteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoteurRepository extends MongoRepository<Moteur, String> {
}
