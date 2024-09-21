package model;

import java.util.UUID;

public class Seat {
  String id;
  String number;
  SeatType seatType;

  boolean available;

  public Seat(String number, SeatType seatType) {
    this.id = UUID.randomUUID().toString();
    this.number = number;
    this.seatType = seatType;
    this.available = true;
  }

  public String getId() {
    return id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public SeatType getSeatType() {
    return seatType;
  }

  public void setSeatType(SeatType seatType) {
    this.seatType = seatType;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}
