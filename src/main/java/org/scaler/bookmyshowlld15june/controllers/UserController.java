package org.scaler.bookmyshowlld15june.controllers;

import org.scaler.bookmyshowlld15june.dtos.ResponseStatus;
import org.scaler.bookmyshowlld15june.dtos.SignUpRequestDTO;
import org.scaler.bookmyshowlld15june.dtos.SignUpResponseDTO;
import org.scaler.bookmyshowlld15june.models.User;
import org.scaler.bookmyshowlld15june.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    private UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(
            SignUpRequestDTO request
    ){
        SignUpResponseDTO response = new SignUpResponseDTO();

        try{
            User user = userService.singUp(request.getEmail(),
                    request.getPassword());

            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("User Successfully Signed Up");

        }catch(Exception ex){
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage(ex.getMessage());
        }

        return response;
    }
}
