package tn.esprit.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;
import java.util.List;

@RestController
@RequestMapping("/agence")
@Tag(name = "gestion des agences")
@AllArgsConstructor
public class AgenceController {
    private final IAgenceService agenceService;

    @PostMapping("/ajouter")
    public Agence ajouter(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifier")
    public Agence modifier(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence getById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @GetMapping("/all")
    public List<Agence> getAll() {
        return agenceService.getAllAgence();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        agenceService.supprimerAgenceById(id);
    }

    @Operation(summary = "ajouter une agence et lui affecter des vehicules")
    @PostMapping("/ajouterAgenceEtAffecterVehicules")
    public Agence ajouterAgenceEtAffecterVehicules(@RequestBody Agence agence) {
        return agenceService.ajouterAgenceEtAffecterVehicules(agence);
    }
}
