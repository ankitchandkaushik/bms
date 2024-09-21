package service;

import model.Booking;
import model.Cinema;
import model.Seat;
import model.User;

import java.util.List;

public class BookingService {
  SearchService searchService;
  PaymentService paymentService;

  CinemaManagementService cinemaManagementService;

  public BookingService(SearchService searchService, PaymentService paymentService, CinemaManagementService cinemaManagementService) {
    this.searchService = searchService;
    this.paymentService = paymentService;
    this.cinemaManagementService = cinemaManagementService;
  }

  public void makeBooking(Booking booking, User user, List<Seat> seats) throws InterruptedException {
    booking.setUser(user);
    booking.setSeats(seats);
    reserveSeat(booking);
    String paymentId = paymentService.makePayment(booking);

    Thread.sleep(5000);
    if(paymentId != null) {
      List<Seat> seatList = booking.getShow().getSeats();
      for(Seat seat: seatList) {
        seat.setAvailable(false);
      }
    }

  }

  private void reserveSeat(Booking booking) {
    List<Seat> seatList = booking.getShow().getSeats();
    for(Seat bookedSeat: booking.getSeats()) {
      for(Seat seat: seatList) {
        if(bookedSeat.getId().equals(seat.getId())) {
          seat.setAvailable(false);
        }
      }
    }
    Cinema cinema = cinemaManagementService.getCinemaMap().get(booking.getShow().getCinemaId());
    cinema.getShowMap().put(booking.getShow().getId(), booking.getShow());
    cinemaManagementService.cinemaMap.put(cinema.getId(), cinema);

  }
}
