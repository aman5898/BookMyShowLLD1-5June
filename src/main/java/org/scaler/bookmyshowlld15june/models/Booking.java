package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.dialect.BooleanDecoder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private int amount;
//    1 : M
////    B : P
//    1:1

    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;
//1: 1
////    B : U
//    M:1

    @ManyToOne
    private User bookedBy;
    private Date bookingDate;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @OneToMany
    @JoinColumn(name= "booking_id")
    private List<ShowSeat> showSeats;
}

//Booking
//name id BookingStatus
//              0
//
//BookingStatus
//        0 -> Booked
//1 -> Cancelled

// Booking

//id name BookingStatus


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