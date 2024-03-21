package edu.lemon.singleresponsibility.wrongcode;

import edu.lemon.singleresponsibility.model.EmployeeType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImplementation implements Employee {

  private final String employeeName;
  private final BigDecimal employeeRate;
  private final EmployeeType employeeType;

  private final int workExperience;

  private final List<String> employees;


  public EmployeeImplementation(
      String employeeName,
      BigDecimal employeeRate,
      EmployeeType employeeType,
      int workExperience) {
    this.employeeName = employeeName;
    this.employeeRate = employeeRate;
    this.employeeType = employeeType;
    this.workExperience = workExperience;
    employees = new ArrayList<>();
  }

  @Override
  public BigDecimal calculatePay() {
    return employeeRate.multiply(new BigDecimal(regularHours(employeeType)));
  }

  @Override
  public String reportHours() {
    return String.join(";\n", employees);
  }

  @Override
  public void save() {
    employees.add(createHoursReport());
  }
  private int regularHours(EmployeeType employee) {
    return switch (employee) {
      case FULL_TIME -> 160;
      case CONTRACTOR -> 160 + workExperience *  5 / 3;
      case PART_TIME -> 80;
      case HOURLY_RATED -> 50;
    };
  }

  private String createHoursReport(){
    return String.format(
        "EmployeeImplementation %s has been worked for %d ",
        employeeName, regularHours(employeeType));
  }
}
