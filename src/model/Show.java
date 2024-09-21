package model;

import java.util.List;

public class Show {
  String id;
//  Cinema cinema;
  List<Seat> seats;
  Event event;

  String cinemaId;

  public Show(String id, List<Seat> seats, Event event, String cinemaId) {
    this.id = id;
//    this.cinema = cinema;
    this.seats = seats;
    this.event = event;
    this.cinemaId = cinemaId;
  }

  public String getId() {
    return id;
  }

  public Event getEvent() {
    return event;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

  public String getCinemaId() {
    return cinemaId;
  }
}
