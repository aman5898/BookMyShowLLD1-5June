package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duration;
    @OneToMany
    private Screen screen;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}



