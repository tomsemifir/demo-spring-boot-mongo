package fr.semifir.demospring.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Voiture {

    @Id
    private String id;

    private String marque;
    private String couleur;
    private Moteur moteur;

    public Voiture(String marque, String couleur, Moteur moteur) {
        this.moteur = moteur;
        this.marque = marque;
        this.couleur = couleur;
    }
}
