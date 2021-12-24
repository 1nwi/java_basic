package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        int calc = height * width;

        return null;
    }
    public void calcPerimeter(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);

    }

}
