package model;

import java.util.HashMap;
import java.util.Map;

public class Cinema {
  String id;
  String name;
  Location location;

  Map<String, Show> showMap;

  public Cinema(String name, Location location) {
    this.name = name;
    this.location = location;
    showMap = new HashMap<>();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Map<String, Show> getShowMap() {
    return showMap;
  }

  public void setShowMap(Map<String, Show> showMap) {
    this.showMap = showMap;
  }
}
