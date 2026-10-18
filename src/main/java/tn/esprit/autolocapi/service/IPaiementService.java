package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    Paiement getPaiementById(Long id);
    List<Paiement> getAllPaiement();
    void supprimerPaiementById(Long id);
}