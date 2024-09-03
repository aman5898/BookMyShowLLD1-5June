package org.scaler.bookmyshowlld15june.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel{
    private Show show;
    private SeatType seatType;
    private int Price;
}
