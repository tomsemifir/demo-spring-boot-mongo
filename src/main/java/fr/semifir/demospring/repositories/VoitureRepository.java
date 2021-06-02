package fr.semifir.demospring.repositories;

import fr.semifir.demospring.models.Voiture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoitureRepository extends MongoRepository<Voiture, String> {

}
