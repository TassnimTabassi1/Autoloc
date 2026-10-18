package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Employe;
import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    Employe getEmployeById(Long id);
    List<Employe> getAllEmploye();
    void supprimerEmployeById(Long id);
}