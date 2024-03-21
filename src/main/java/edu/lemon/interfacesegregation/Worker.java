package edu.lemon.interfacesegregation;

public class Worker implements Employee {
  @Override
  public void work() {
    System.out.println("Worker works");
  }

}
