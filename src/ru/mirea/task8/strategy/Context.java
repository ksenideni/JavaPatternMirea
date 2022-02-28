package ru.mirea.task8.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }
}
