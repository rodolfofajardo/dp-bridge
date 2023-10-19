package com.ixns.shape;

import com.ixns.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("This is a square, " + getColor().paint());
    }
}
