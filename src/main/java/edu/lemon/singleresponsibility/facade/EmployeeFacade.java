package edu.lemon.singleresponsibility.facade;

import edu.lemon.singleresponsibility.database.Database;
import edu.lemon.singleresponsibility.model.EmployeeDataModel;

import java.math.BigDecimal;

public class EmployeeFacade {
  private final EmployeeDataModel employeeDataModel;
  private final Database database;

  public EmployeeFacade(EmployeeDataModel employeeDataModel) {
    this.employeeDataModel = employeeDataModel;
    database = new Database();
  }

  public String reportHours() {
    return new HourReporter(database).reportHours();
  }

  public BigDecimal calculatePay() {
    return employeeDataModel.hourlyRate().multiply(BigDecimal.valueOf(employeeDataModel.hoursByContractPerMonth()));
  }

  public void save() {
    new EmployeeSaver(database, employeeDataModel).save();
  }


}
