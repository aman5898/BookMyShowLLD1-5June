package org.scaler.bookmyshowlld15june.repositories;

import org.scaler.bookmyshowlld15june.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show,Integer> {
}
