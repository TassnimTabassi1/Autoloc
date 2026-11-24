package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.AgenceRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class IAgenceServiceImp implements IAgenceService {
    private final AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> getAllAgence() {
        return agenceRepository.findAll();
    }

    @Override
    public void supprimerAgenceById(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence ajouterAgenceEtAffecterVehicules(Agence agence) {
        // chaque vehicule recoit l'agence (Vehicule est le proprietaire de la relation)
        for (Vehicule v : agence.getVehicules()) {
            v.setAgence(agence);
        }
        // cascade ALL : l'agence et ses vehicules sont enregistres ensemble
        return agenceRepository.save(agence);
    }
}
