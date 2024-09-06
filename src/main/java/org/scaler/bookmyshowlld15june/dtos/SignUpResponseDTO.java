package org.scaler.bookmyshowlld15june.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {
    private int userId;
    private ResponseStatus status;
    private String message;
}
