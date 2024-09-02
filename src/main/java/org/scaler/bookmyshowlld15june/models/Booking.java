package org.scaler.bookmyshowlld15june.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel{
    private int amount;
    private List<Payment> payments;
    private User bookedBy;
    private Date bookingDate;
    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeats;
}

// Break 10:28pm : 10:33pm

//ORM :
//O : Object R Relation M Mapping
//Hibernate

//PhonePe
//PhonePe -> yesBank
//SpringBoot -> Hibernate
//JPA
//PhonePe -> BankApi <- YesBank
//SB -> JPA <- Hibernate

//- To ensure Proper contracts are there. Spring Data JPA is the interface for all SQL
// DB’s.
//- Basically why JPA is there so Other ORM’s don’t change the Syntax as per their Choice.
//        - Hibernate has to follow JPA contracts.
//        - Spring Data JPA → is an interface which contains methods which are
//        implemented by Hibernate.

// How will the ORM know which table to create?