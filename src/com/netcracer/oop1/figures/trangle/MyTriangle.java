package com.netcracer.oop1.figures.trangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimetr() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        return a + b + c;
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        double epsilon = 0.000001d;




        if (Math.abs(a-b) <= 0.00001 && Math.abs(a-c) <= 0.00001 && Math.abs(c-b) <= 0.00001) return "Equilateral ";
        if (Math.abs(a-b) <= 0.00001 || Math.abs(a-c) <= 0.00001 || Math.abs(c-b) <= 0.00001) return "Isosceles ";
        else return "Scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}
