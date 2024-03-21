package edu.lemon.openclose;

public class ShapeCalculator {
  public static double calculateArea(Shape shape){
    return shape.height() * shape.width();
  }

  public static double calculateArea(ShapeParallelepipid shapeParallelepipid){
    return shapeParallelepipid.height() * shapeParallelepipid.height() * shapeParallelepipid.deep();
  }

}
