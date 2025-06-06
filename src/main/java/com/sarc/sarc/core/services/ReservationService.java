package com.sarc.sarc.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sarc.sarc.core.domain.entities.Reservation;
import com.sarc.sarc.infrastructure.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public ResponseEntity<Reservation> getReservationById(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.map(ResponseEntity::ok)
                          .orElse(ResponseEntity.notFound().build());
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public ResponseEntity<Reservation> updateReservation(Long id, Reservation updatedReservation) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);

        if (!optionalReservation.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        //Reservation existingReservation = optionalReservation.get();
        //Atualizar campos conforme parâmetros da classe, por exemplo:
        //existingReservation.setClass(updatedReservation.getClass());
        //existingReservation.setResource(updatedReservation.getResource());

        //Por enquanto, só setId
        updatedReservation.setId(id);

        Reservation savedReservation = reservationRepository.save(updatedReservation);
        return ResponseEntity.ok(savedReservation);
    }

    public boolean deleteReservation(Long id) {
    Optional<Reservation> reservation = reservationRepository.findById(id);
    if (!reservation.isPresent()) {
        return false;
    }
    reservationRepository.deleteById(id);
    return true;
}

}