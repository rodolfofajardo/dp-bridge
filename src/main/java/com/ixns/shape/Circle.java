package com.ixns.shape;

import com.ixns.color.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("This is a circle, " + getColor().paint());
    }
}
