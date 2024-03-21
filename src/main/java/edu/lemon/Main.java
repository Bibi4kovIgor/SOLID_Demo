package edu.lemon;

import edu.lemon.singleresponsibility.facade.EmployeeFacade;
import edu.lemon.singleresponsibility.model.EmployeeDataModel;
import edu.lemon.singleresponsibility.wrongcode.Employee;
import edu.lemon.singleresponsibility.wrongcode.EmployeeImplementation;
import edu.lemon.utils.EmployeeData;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    calculate(Main::calculateWithWrongCode);
    System.out.println("\nRegular code\n");
    calculate(Main::calculateWithRegularCode);

  }

  private static void calculate(Consumer<EmployeeDataModel> employeeDataConsumer) {
    EmployeeData.employees.forEach(employeeDataConsumer);
  }

  private static void calculateWithWrongCode(EmployeeDataModel employeeData) {
    Employee employeeImplementation =
        new EmployeeImplementation(
            employeeData.name(),
            employeeData.hourlyRate(),
            employeeData.employeeType(),
            employeeData.workExperienceInYears()
        );
    employeeImplementation.save();
    String report = employeeImplementation.reportHours();
    BigDecimal salary = employeeImplementation.calculatePay();

    printReport(report, salary);
  }

  private static void calculateWithRegularCode(EmployeeDataModel employeeDataModel) {
    EmployeeFacade employeeFacade = new EmployeeFacade(employeeDataModel);
    employeeFacade.save();
    String reportHours = employeeFacade.reportHours();
    BigDecimal salary = employeeFacade.calculatePay();
    printReport(reportHours, salary);
  }

  private static void printReport(String report, BigDecimal salary){
    System.out.printf("%s calculated salary is %s%n", report, salary);
  }
}