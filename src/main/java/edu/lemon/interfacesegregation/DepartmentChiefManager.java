package edu.lemon.interfacesegregation;

public class DepartmentChiefManager implements Manager {

  @Override
  public void work() {

  }

  @Override
  public void manage() {
    System.out.println("Manager managing");
  }
}
