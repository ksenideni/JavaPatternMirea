package ru.mirea.task8.strategy;

public class StrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
