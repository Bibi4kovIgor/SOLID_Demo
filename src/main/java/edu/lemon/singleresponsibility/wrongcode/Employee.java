package edu.lemon.singleresponsibility.wrongcode;

import edu.lemon.singleresponsibility.model.Report;

import java.math.BigDecimal;

public interface Employee {
  BigDecimal calculatePay();
  String reportHours();
  void save();
}
