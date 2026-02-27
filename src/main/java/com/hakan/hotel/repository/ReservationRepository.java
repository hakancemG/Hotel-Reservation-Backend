package com.hakan.hotel.repository;

import com.hakan.hotel.entity.Reservation;
import com.hakan.hotel.entity.ReservationStatus;
import com.hakan.hotel.entity.Customer;
import com.hakan.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByCustomer(Customer customer);

    List<Reservation> findByRoom(Room room);

    List<Reservation> findByStatus(ReservationStatus status);

}