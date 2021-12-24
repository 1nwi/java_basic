package com.kh.practice.point.model.vo;

public class Circle extends Point {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        super.toString();
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
