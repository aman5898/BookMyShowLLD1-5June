package org.scaler.bookmyshowlld15june;

import org.scaler.bookmyshowlld15june.controllers.UserController;
import org.scaler.bookmyshowlld15june.dtos.SignUpRequestDTO;
import org.scaler.bookmyshowlld15june.dtos.SignUpResponseDTO;
import org.scaler.bookmyshowlld15june.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowLld15JuneApplication implements CommandLineRunner {
    @Autowired
    UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO requestDTO = new SignUpRequestDTO();
        requestDTO.setEmail("Hari@gmail.com");
        requestDTO.setPassword("12345");

        SignUpResponseDTO responseDTO = userController.signUp(requestDTO);
        System.out.println(responseDTO.getMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowLld15JuneApplication.class, args);


    }

//    Cardinalities
//    Generate the table by running the code
//    -Agenda
//    - [ ]  Book My Ticket Functionality
//    - [ ]  Signup Functionality



}
