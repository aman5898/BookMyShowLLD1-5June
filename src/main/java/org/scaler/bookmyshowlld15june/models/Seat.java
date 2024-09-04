package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private String seatNumber;
    private int row;
    private int col;
    @ManyToOne
    private SeatType seatType;
}
