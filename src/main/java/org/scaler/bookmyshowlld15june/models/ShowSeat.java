package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;

    @Enumerated(value = EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
    private Date blockedAt;
}
//1 show seat will have only 1 show
//same show can have multiple showseats/

//1 : 1
//showseat : show
//M:1


// show 1 25b empty -> show1
// show 1 26 A filled -> show1

// Show 2 25b empty => Seat 25b
// show 1 25b empty -> seat 25b

