package com.ixns.shape;

import com.ixns.color.Color;

public abstract class Shape {

    private final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    protected Color getColor() {
        return color;
    }

    public abstract void draw();
}
