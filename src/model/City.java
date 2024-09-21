package model;

import java.util.List;
import java.util.UUID;

public class City {
  String id;
  String name;
  List<Cinema> cinemas;


  public City(String name, List<Cinema> cinemas) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.cinemas = cinemas;
  }
}
