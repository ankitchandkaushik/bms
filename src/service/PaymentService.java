package service;

import model.Booking;

import java.util.Random;
import java.util.UUID;

public class PaymentService {

  public PaymentService(){

  }

  public String makePayment(Booking booking) {
    Random random = new Random();
    int decider = random.nextInt(2);
    if(decider == 0) {
      return null;
    } else {
      return UUID.randomUUID().toString();
    }
  }
}
