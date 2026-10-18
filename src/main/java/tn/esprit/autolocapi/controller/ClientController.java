package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;
import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private final IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouter(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/modifier")
    public Client modifier(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAllClient();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        clientService.supprimerClientById(id);
    }
}