package org.scaler.bookmyshowlld15june.repositories;

import org.scaler.bookmyshowlld15june.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {
}
