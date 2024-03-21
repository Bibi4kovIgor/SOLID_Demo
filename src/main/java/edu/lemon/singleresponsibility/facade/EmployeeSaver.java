package edu.lemon.singleresponsibility.facade;

import edu.lemon.singleresponsibility.database.Database;
import edu.lemon.singleresponsibility.model.EmployeeDataModel;
import edu.lemon.singleresponsibility.model.Report;

import java.math.BigDecimal;

public class EmployeeSaver {
    private final Database database;
    private final EmployeeDataModel employeeDataModel;

    public EmployeeSaver(Database database, EmployeeDataModel employeeDataModel) {
      this.database = database;
      this.employeeDataModel = employeeDataModel;
    }

    public void save() {
        database.save(new Report(employeeDataModel, prepareReport()));
    }

    private String prepareReport() {
        return String.format(
                "EmployeeImplementation %s has been worked for %s hours and got %5.2f$",
                employeeDataModel.name(), regularHours(), employeeDataModel.hourlyRate().multiply(regularHours()));
    }

    private BigDecimal regularHours(){
        return employeeDataModel.hourlyRate().multiply(new BigDecimal((160)));
    }
}
