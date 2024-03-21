package edu.lemon.singleresponsibility.wrongcode;

import java.math.BigDecimal;

public interface Employee {
  BigDecimal calculatePay();
  String reportHours();
  void save();
}
