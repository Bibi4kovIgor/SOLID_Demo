package edu.lemon.openclose;

public class ShapeParallelepipid extends Shape {
  private final int deep;
  public ShapeParallelepipid(int width, int height, int deep) {
    super(width, height);
    this.deep = deep;
  }

  public int deep() {
    return deep;
  }
}
