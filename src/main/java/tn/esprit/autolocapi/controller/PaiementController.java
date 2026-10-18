package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;
import java.util.List;

@RestController
@RequestMapping("/paiement")
@AllArgsConstructor
public class PaiementController {
    private final IPaiementService paiementService;

    @PostMapping("/ajouter")
    public Paiement ajouter(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @PutMapping("/modifier")
    public Paiement modifier(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement getById(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @GetMapping("/all")
    public List<Paiement> getAll() {
        return paiementService.getAllPaiement();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        paiementService.supprimerPaiementById(id);
    }
}