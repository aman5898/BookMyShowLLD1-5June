package org.scaler.bookmyshowlld15june.service;

import org.scaler.bookmyshowlld15june.models.*;
import org.scaler.bookmyshowlld15june.repositories.BookingRepository;
import org.scaler.bookmyshowlld15june.repositories.ShowRepository;
import org.scaler.bookmyshowlld15june.repositories.ShowSeatRepository;
import org.scaler.bookmyshowlld15june.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRespository userRespository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;

    @Autowired
    BookingService(UserRespository userRespository,
                   ShowRepository showRepository,
                   ShowSeatRepository showSeatRepository,
                   BookingRepository bookingRepository){
        this.userRespository = userRespository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(
            List<Integer> showSeatIds,
            int showId,
            int userId
    ){
//        1. Get User using the userId
        Optional<User> userOptional =  userRespository.findById(userId);
        if(userOptional.isEmpty()){
            throw new RuntimeException("User Not Found");
        }

        User user = userOptional.get();
//        2. Get Show using the ShowId
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw new RuntimeException("Show not found");
        }
        Show show = showOptional.get();

//        --------- Start Transaction ---------
//        3. Get ShowSeats via ShowSeatIds
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
//        4. Check for all teh seats are available
        for(ShowSeat showSeat:showSeats){
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
//                If no, return with an error Message
                throw new RuntimeException("Selected Show Seats are not available");
            }
        }
//
//          If yes mark seats as blocked

        for(ShowSeat showSeat:showSeats){
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
        }
//
        showSeatRepository.saveAll(showSeats);

        //        --------- Stop Transaction ---------

        //5.2 Calculate the Price
//         Price Calculator Service
//        Useing Show , get all show Seat Types
//         traverse the list based on that, identify the prices of your seat

        //

        // 7. Properly create the booking Object, save and return it.
        Booking booking = new Booking();
        booking.setBookedBy(user);
        booking.setBookingDate(new Date());
        booking.setBookingStatus(BookingStatus.SUCCESSFUL);
        booking.setAmount(100);
        booking.setShowSeats(showSeats);
        return bookingRepository.save(booking);
    }

    // you need to inject the data and get it working
    // Try converting it to Rest ApI
    // Run on A specific Port.
    // Try to hit this with multiple booking request to check for locking situation.

}

// ShowController -> Show Service ->
