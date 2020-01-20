package com.sda;

public class Developer extends Person { //is-a


  public Developer(String name){
    super(name);
    System.out.println("Developer: You are a developer");
  }
  public Developer(String name, int age){
    super(name, age);
    System.out.println("Developer: You are a developer");
  }

  public void sayHello(){
    System.out.println("Buna!");
  }

  public void oMetoda(int i){
    System.out.println("In developer cu int");
  }
}
