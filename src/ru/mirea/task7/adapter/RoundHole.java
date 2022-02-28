package ru.mirea.task7.adapter;

public class RoundHole { //КруглоеОтверстие совместимо с КруглымиКолышками.
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return  (this.getRadius() >= peg.getRadius());
    }
}