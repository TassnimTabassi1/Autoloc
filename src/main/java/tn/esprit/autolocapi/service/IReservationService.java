package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservation();
    void supprimerReservationById(Long id);
}