package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;
import java.util.List;

@RestController
@RequestMapping("/contrat")
@AllArgsConstructor
public class ContratController {
    private final IContratService contratService;

    @PostMapping("/ajouter")
    public Contrat ajouter(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifier")
    public Contrat modifier(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat getById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @GetMapping("/all")
    public List<Contrat> getAll() {
        return contratService.getAllContrat();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        contratService.supprimerContratById(id);
    }
}