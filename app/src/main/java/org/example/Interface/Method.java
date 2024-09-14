package org.example.Interface;

public interface Method {

  String shapeName();

  void message();

  static void name(String name) {
    System.out.println(name + " is a great choice");
  }

  static void more() {
    System.out.println("Lots to explore in Geometry");
  }

}
