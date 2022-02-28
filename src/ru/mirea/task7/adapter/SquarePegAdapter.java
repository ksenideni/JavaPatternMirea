package ru.mirea.task7.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        return  (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));

    }
}