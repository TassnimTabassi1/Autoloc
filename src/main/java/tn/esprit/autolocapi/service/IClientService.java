package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClient();
    void supprimerClientById(Long id);
}