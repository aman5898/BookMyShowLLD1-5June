package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private String refNumber;
    private Date paymentDate;
    @ManyToOne
    private PaymentMode paymentMode;
    @ManyToOne
    private PaymentStatus paymentStatus;
    @ManyToOne
    private PaymentGateway paymentGateway;
    @ManyToOne
    private Booking booking;
}
