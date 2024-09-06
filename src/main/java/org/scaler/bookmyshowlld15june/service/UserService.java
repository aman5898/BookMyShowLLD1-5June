package org.scaler.bookmyshowlld15june.service;

import org.scaler.bookmyshowlld15june.models.User;
import org.scaler.bookmyshowlld15june.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    private UserRespository userRespository;

    @Autowired
    public UserService(UserRespository userRespository){
        this.userRespository = userRespository;
    }

    public User singUp(
            String email,
            String password
    ){
        // 1. Check if the email is already registered
        Optional<User> userOptional = userRespository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("Uesr already exists");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName("Temp User");
        user.setLastName("");
        user.setUserName(email);
        user.setBookings(new ArrayList<>());

        return userRespository.save(user);
    }
}
