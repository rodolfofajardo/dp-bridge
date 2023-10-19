package com.ixns;

import com.ixns.color.Black;
import com.ixns.color.Green;
import com.ixns.color.Red;
import com.ixns.shape.Circle;
import com.ixns.shape.Shape;
import com.ixns.shape.Square;
import com.ixns.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        shape.draw();
        shape = new Circle(new Green());
        shape.draw();
        shape = new Circle(new Black());
        shape.draw();

        shape = new Square(new Red());
        shape.draw();
        shape = new Square(new Green());
        shape.draw();
        shape = new Square(new Black());
        shape.draw();

        shape = new Triangle(new Red());
        shape.draw();
        shape = new Triangle(new Green());
        shape.draw();
        shape = new Triangle(new Black());
        shape.draw();
    }
}