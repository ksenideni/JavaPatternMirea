package ru.mirea.task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Double> comparator = ((o1, o2) -> Double.compare(Math.abs(o1), Math.abs(o2)));
        System.out.println(comparator.compare(12.5, 19.0));//тест 1
        System.out.println(comparator.compare(12.5, 12.5));//тест 2
        System.out.println(comparator.compare(22.0, 19.0));//тест 3
    }
}
