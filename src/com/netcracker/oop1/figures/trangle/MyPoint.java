package com.netcracker.oop1.figures.trangle;

import java.util.Objects;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x && y == myPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        double distanceToX = Math.pow(x - (this.x), 2);
        double distanceToY = Math.pow(y - (this.y), 2);
        return Math.sqrt(distanceToX + distanceToY);
    }

    public double distance(MyPoint anotger) {
        double distanceToX = Math.pow(anotger.getX() - (this.x), 2);
        double distanceToY = Math.pow(anotger.getY() - (this.y), 2);
        return Math.sqrt(distanceToX + distanceToY);
    }

    public double distance() {
        double distanceToX = Math.pow(-(this.x), 2);
        double distanceToY = Math.pow(-(this.y), 2);
        return Math.sqrt(distanceToX + distanceToY);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
