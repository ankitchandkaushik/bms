package service;

import model.*;

import java.util.*;

public class SearchService {
  CinemaManagementService cinemaManagementService;
  public SearchService(CinemaManagementService cinemaManagementService) {
    this.cinemaManagementService = cinemaManagementService;
  }

  public List<String> listAllAvailableCities() {
    HashSet<String> cities = new HashSet<>();
    for(String key: cinemaManagementService.getCinemaMap().keySet()) {
      Cinema cinema = cinemaManagementService.getCinemaMap().get(key);
      String city = cinema.getLocation().getCity();
      cities.add(city);
    }
    System.out.println("Listing available cities");
    for(String city: cities) {
      System.out.println(city);
    }
    return new ArrayList<>(cities);
  }

  public List<String> listShowsByCity(String city) {
    Set<String> movies = new HashSet<>();
    for(String key: cinemaManagementService.getCinemaMap().keySet())  {
      Cinema cinema = cinemaManagementService.getCinemaMap().get(key);
      if(city.equals(cinema.getLocation().getCity())) {
        for(String showKey: cinema.getShowMap().keySet()) {
          Show show = cinema.getShowMap().get(showKey);
          movies.add(show.getEvent().getName());
        }
      }
    }
    System.out.println("Listing events available in city: " + city);
    for(String movie: movies) {
      System.out.println(movie);
    }
    return new ArrayList<>(movies);
  }

  public List<Booking> listShowsByEvent(Event event, String city) {
    Set<Booking> shows = new HashSet<>();
    for(String key: cinemaManagementService.getCinemaMap().keySet())  {
      Cinema cinema = cinemaManagementService.getCinemaMap().get(key);
      if(city.equals(cinema.getLocation().getCity())) {
        for(String showKey: cinema.getShowMap().keySet()) {
          Show show = cinema.getShowMap().get(showKey);
          if(event.getName().equals(show.getEvent().getName())) {
            Booking booking = new Booking(show, cinema);
            shows.add(booking);
          }
        }
      }
    }
    System.out.println("Listing shows available in city: " + city + " event: " + event.getName());
    for(Booking show: shows) {
      System.out.println(show);
    }
    return new ArrayList<>(shows);
  }

  public List<Seat> selectSeats(Booking booking) {
    System.out.println("Listing all seats");
    for(Seat s: booking.getShow().getSeats()) {
      System.out.println(s);
    }
    return booking.getShow().getSeats();
  }
}
