package edu.lemon.singleresponsibility.facade;

import edu.lemon.singleresponsibility.database.Database;
import edu.lemon.singleresponsibility.model.EmployeeDataModel;
import edu.lemon.singleresponsibility.model.Report;

import java.util.stream.Collectors;

public class HourReporter {

  private final Database employeeDataBase;

  public HourReporter(Database employeeDataBase) {
    this.employeeDataBase = employeeDataBase;
  }

  public String reportHours() {
    return employeeDataBase.getReports().stream()
        .map(Report::employeeDataModel)
        .map(HourReporter::prepareToReport)
        .collect(Collectors.joining(";\n"));
  }

  private static String prepareToReport(EmployeeDataModel employeeDataModel) {
    return String.format(
        "Employee %s has been worked for %d hours.",
        employeeDataModel.name(), employeeDataModel.hoursByContractPerMonth());
  }

}
