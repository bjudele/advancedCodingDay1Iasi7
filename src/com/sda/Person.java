package com.sda;

public class Person {

  //has-a
  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
    System.out.println("Person: Hello " + name);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Person: Hello " + name + ", you are "
        + age + " years old");
  }

  public void oMetoda(int i) {
    System.out.println("In person with int");
  }

//  public void oMetoda(String x) {
//    System.out.println("In person with string");
//  }


}
