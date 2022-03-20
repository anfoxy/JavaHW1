package com.netcracer.oop1.figures.trangle;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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
