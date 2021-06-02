package fr.semifir.demospring.config;

import fr.semifir.demospring.models.Moteur;
import fr.semifir.demospring.models.Voiture;
import fr.semifir.demospring.services.GenericService;
import fr.semifir.demospring.services.impl.MoteurServiceImpl;
import fr.semifir.demospring.services.impl.VoitureServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public GenericService<Voiture> voitureServiceFactory() {
        return new VoitureServiceImpl();
    }

    @Bean
    // public MoteurService
    public GenericService<Moteur> moteurServiceFactory() {
        return new MoteurServiceImpl();
    }
}
