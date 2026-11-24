package tn.esprit.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;
import java.util.List;

@RestController
@RequestMapping("/employe")
@Tag(name = "gestion des employes")
@AllArgsConstructor
public class EmployeController {
    private final IEmployeService employeService;

    @PostMapping("/ajouter")
    public Employe ajouter(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifier")
    public Employe modifier(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @GetMapping("/all")
    public List<Employe> getAll() {
        return employeService.getAllEmploye();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        employeService.supprimerEmployeById(id);
    }

    @Operation(summary = "desaffecter un employe de son agence")
    @PutMapping("/desaffecter/{idEmploye}")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @Operation(summary = "affecter un employe a une agence")
    @PutMapping("/affecter/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}
