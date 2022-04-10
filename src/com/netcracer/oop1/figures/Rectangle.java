package com.netcracer.oop1.figures;

import java.util.Objects;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        if (length < 0) length = 0;
        if (width < 0) width = 0;
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, length) == 0 && Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public void setLength(float length) {
        if (length < 0) length = 0;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width < 0) width = 0;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
