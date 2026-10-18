package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

@RestController

@AllArgsConstructor
@RequestMapping("/vehicules")
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
}
