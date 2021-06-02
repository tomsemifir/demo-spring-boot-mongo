package fr.semifir.demospring.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Message {

    private String message;
    private LocalDate date = LocalDate.now();

    public Message(String message) {
        this.message = message;
    }
}
