package fr.semifir.demospring.controllers;

import fr.semifir.demospring.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("messages")
public class MessageController {

    public List<Message> messages = new ArrayList<Message>();

    @GetMapping()
    /**
     * Cette méthode retourne la liste de tous les messages
     */
    public List<Message> getAllMessages() {
        return this.messages;
    }

    @GetMapping("{id}")
    /**
     * Cette méthode retourne le message avec l'id {id}
     */
    public Message getMessageById(@PathVariable int id) {
        return this.messages.get(id);
    }

    @PostMapping()
    /**
     * Cette méthode créer un nouveau message et l'ajoute à la liste
     */
    public Message save(@RequestBody String msg) {
        Message message = new Message(msg);
        this.messages.add(message);
        return message;
    }

    @PatchMapping("{id}")
    public Message update(@PathVariable int id, @RequestBody String msg) {
        this.messages.get(id).setMessage(msg);
        return this.messages.get(id);
    }

    @DeleteMapping("{id}")
    public Message delete(@PathVariable int id) {
        return this.messages.remove(id);
    }
}
