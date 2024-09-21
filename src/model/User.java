package model;

public class User {
  String id;
  String name;

  public User(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
