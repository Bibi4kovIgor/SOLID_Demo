package edu.lemon.interfacesegregation;

public class Main {
  public static void main(String[] args) {
    Employee[] workers ={ new Worker(), new DepartmentChiefManager() };
    for (Employee employee : workers) {
      System.out.println(employee);
    }


  }
}
