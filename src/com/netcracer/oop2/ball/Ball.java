package com.netcracer.oop2.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (direction > 180) direction = 180;
        if (direction < -180) direction = -180;
        this.xDelta = (float) (speed * Math.cos((double) direction/57.3));
        this.yDelta = (float) ( -speed * Math.sin((double) direction/57.3));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public String toString() {
        return "Ball{ (" + x + "," + y + ") speed= (" + xDelta + "," + yDelta + ") }";
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }
}
