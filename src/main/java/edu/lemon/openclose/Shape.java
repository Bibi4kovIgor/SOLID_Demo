package edu.lemon.openclose;

import java.util.Objects;

public class Shape {
  private final int width;
  private final int height;

  public Shape(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int width() {
    return width;
  }

  public int height() {
    return height;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Shape) obj;
    return this.width == that.width &&
        this.height == that.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    return "Shape[" +
        "width=" + width + ", " +
        "height=" + height + ']';
  }
}
