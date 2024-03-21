package edu.lemon.interfacesegregation;

public class Main {
  public static void main(String[] args) {
    Employee[] workers ={ new Worker(), new DepartmentChiefManager() };
    for (Employee employee : workers) {
      switch (employee){
        case Worker worker -> worker.work();
        case Manager manager -> manager.manage();
        default -> throw new RuntimeException("Unknown type exception");
      }
    }


  }
}
