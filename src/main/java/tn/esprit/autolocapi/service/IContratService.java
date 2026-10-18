package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat getContratById(Long id);
    List<Contrat> getAllContrat();
    void supprimerContratById(Long id);
}