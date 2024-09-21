package model;

import java.util.UUID;

public class Event {
  String id;
  String name;
  String description;

  public Event(String name, String description) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.description = description;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
