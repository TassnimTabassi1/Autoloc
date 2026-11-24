package tn.esprit.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

@RestController

@AllArgsConstructor
@RequestMapping("/vehicules")
@Tag(name = "gestion des vehicules")
public class VehiculeController {
    private final IVehiculeService vehiculeService;
    @PostMapping("/ajouterVehicule")
    public Vehicule  ajouterVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
public Vehicule modifierVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.modifierVehicule(vehicule);

    }
    @GetMapping("/recupererVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeService.getVehiculeById(id);
    }
    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehiculeById(@PathVariable Long id){
        vehiculeService.supprimerVehiculeById(id);

    }
    @GetMapping("/recupererTousVehicules")
    public java.util.List<Vehicule> getAllVehicule(){
        return vehiculeService.getAllVehicule();
    }

    @Operation(summary = "affecter un equipement a un vehicule")
    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @Operation(summary = "desaffecter un equipement d'un vehicule")
    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}
