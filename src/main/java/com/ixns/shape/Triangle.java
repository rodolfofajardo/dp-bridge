package com.ixns.shape;

import com.ixns.color.Color;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("This is a triangle, " + getColor().paint());
    }
}
