package org.scaler.bookmyshowlld15june.repositories;

import org.scaler.bookmyshowlld15june.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
