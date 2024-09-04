package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name ="shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duration;
    @ManyToOne
    private Screen screen;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}

//show -> DDLJ -> Theatre + Screen + Time

//1 : 1
////Show : Movie
//M:1

//// 1: 1
//Show : Screen
//   M:1

//1 : M
//S : C

