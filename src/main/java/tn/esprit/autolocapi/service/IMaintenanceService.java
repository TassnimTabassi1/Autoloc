package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance getMaintenanceById(Long id);
    List<Maintenance> getAllMaintenance();
    void supprimerMaintenanceById(Long id);
}