package org.scaler.bookmyshowlld15june.controllers;

import org.scaler.bookmyshowlld15june.dtos.BookTicketRequestDTO;
import org.scaler.bookmyshowlld15june.dtos.BookTicketResponseDTO;
import org.scaler.bookmyshowlld15june.dtos.ResponseStatus;
import org.scaler.bookmyshowlld15june.models.Booking;
import org.scaler.bookmyshowlld15june.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {


    private BookingService bookingService;

    @Autowired
    BookingController (BookingService bookingService){
        this.bookingService = bookingService;
    }

    BookTicketResponseDTO bookTicket(BookTicketRequestDTO request){
        BookTicketResponseDTO response = new BookTicketResponseDTO();

        try{
            Booking booking = bookingService.bookTicket(
                    request.getShowSeatIds(),
                    request.getShowId(),
                    request.getUserID()
            );

            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }catch(Exception ex){
            response.setResponseStatus(ResponseStatus.FAILED);
        }

        return response;
    }

}
