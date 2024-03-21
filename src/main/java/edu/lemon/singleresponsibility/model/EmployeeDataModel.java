package edu.lemon.singleresponsibility.model;

import java.math.BigDecimal;

public record EmployeeDataModel(
    String name,
    BigDecimal hourlyRate,
    EmployeeType employeeType,
    int workExperienceInYears,
    int hoursByContractPerMonth) {}
