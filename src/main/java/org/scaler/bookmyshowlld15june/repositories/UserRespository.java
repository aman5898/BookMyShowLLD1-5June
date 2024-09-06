package org.scaler.bookmyshowlld15june.repositories;

import org.scaler.bookmyshowlld15june.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.Optional;

@Repository
public interface UserRespository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

    User save(User entity);
}

// select * from user where email = "email_ID"
