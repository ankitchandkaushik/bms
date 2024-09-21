package model;

import java.util.List;
import java.util.UUID;

public class Booking {
  String id;
  Show show;
  Cinema cinema;
  String paymentId;
  User user;
  List<Seat> seats;

  public Booking(Show show, Cinema cinema) {
    this.id = UUID.randomUUID().toString();
    this.show = show;
    this.cinema = cinema;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }

  public Cinema getCinema() {
    return cinema;
  }

  public void setCinema(Cinema cinema) {
    this.cinema = cinema;
  }

  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

  @Override
  public String toString() {
    return "Booking{" + "show=" + show + ", cinema=" + cinema + '}';
  }
}
