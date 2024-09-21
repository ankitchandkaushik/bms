package service;

import model.Cinema;
import model.Show;

import java.util.HashMap;
import java.util.Map;

public class CinemaManagementService {
  Map<String, Cinema> cinemaMap;

  public CinemaManagementService() {
    cinemaMap = new HashMap<>();
  }

  public Cinema addCinema(Cinema cinema) {
    cinemaMap.put(cinema.getId(), cinema);
    return cinema;
  }

  public void addShow(Show show, Cinema cinema) {
    Cinema curr = cinemaMap.get(cinema.getId());
    if(curr == null) {
      System.out.println("Show is not for existing Cinema");
      return ;
    } else {
      curr.getShowMap().put(show.getId(), show);
    }
  }

  public void deleteShow(Show show, Cinema cinema) {
    Cinema curr = cinemaMap.get(cinema.getId());
    if(curr == null) {
      System.out.println("Show is not for existing Cinema");
      return ;
    } else {
      curr.getShowMap().remove(show.getId());
    }
  }

  public Map<String, Cinema> getCinemaMap() {
    return cinemaMap;
  }
}
