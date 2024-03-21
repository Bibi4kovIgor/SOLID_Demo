package edu.lemon.utils;

import edu.lemon.singleresponsibility.model.EmployeeDataModel;
import edu.lemon.singleresponsibility.model.EmployeeType;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeData {
  List<EmployeeDataModel> employees = List.of(
      new EmployeeDataModel(
          "John",
          new BigDecimal("10.25"),
          EmployeeType.CONTRACTOR,
          5,
          160),

      new EmployeeDataModel(
          "David",
          new BigDecimal("12.25"),
          EmployeeType.FULL_TIME,
          7,
          200
      ),

      new EmployeeDataModel(
          "Steve",
          new BigDecimal("18.11"),
          EmployeeType.HOURLY_RATED,
          12,
          120
      ),

      new EmployeeDataModel(
          "Mark",
          new BigDecimal("93.67"),
          EmployeeType.PART_TIME,
          35,
          100));

}
