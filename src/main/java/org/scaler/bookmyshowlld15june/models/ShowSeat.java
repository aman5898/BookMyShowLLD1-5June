package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @OneToOne
    private Seat seat;
    @ManyToOne
    private ShowSeatStatus showSeatStatus;
}
