package io.hexlet;

import lombok.Getter;

@Getter
public class Circle {

    private final Point center;
    private final int radius;
    private double square;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }

        if (!(this.radius > 0)) {
            return 0;
        }

        if (!(square > 0)) {
            this.square = Math.PI * this.radius * this.radius;
        }

        return this.square;
    }
}
