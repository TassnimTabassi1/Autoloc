package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;
import java.util.List;

@RestController
@RequestMapping("/equipement")
@AllArgsConstructor
public class EquipementController {
    private final IEquipementService equipementService;

    @PostMapping("/ajouter")
    public Equipement ajouter(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping("/modifier")
    public Equipement modifier(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement getById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @GetMapping("/all")
    public List<Equipement> getAll() {
        return equipementService.getAllEquipement();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        equipementService.supprimerEquipementById(id);
    }
}