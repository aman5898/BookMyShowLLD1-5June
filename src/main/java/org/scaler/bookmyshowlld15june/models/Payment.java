package org.scaler.bookmyshowlld15june.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private String refNumber;
    private Date paymentDate;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private PaymentGateway paymentGateway;
    private Booking booking;
}
