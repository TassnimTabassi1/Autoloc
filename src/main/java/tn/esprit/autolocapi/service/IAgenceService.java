package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;
import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    Agence getAgenceById(Long id);
    List<Agence> getAllAgence();
    void supprimerAgenceById(Long id);
}