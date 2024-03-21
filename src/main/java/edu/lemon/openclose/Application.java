package edu.lemon.openclose;

public class Application {
  public static void main(String[] args) {
    Shape shape = new Shape(4,5);
    System.out.println(ShapeCalculator.calculateArea(shape));

    ShapeParallelepipid shapeParallelepipid = new ShapeParallelepipid(4,5, 7);
    System.out.println(ShapeCalculator.calculateArea(shapeParallelepipid));
  }
}
