package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    Equipement getEquipementById(Long id);
    List<Equipement> getAllEquipement();
    void supprimerEquipementById(Long id);
}