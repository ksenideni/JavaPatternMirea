package ru.mirea.task8.strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyAdd());
        System.out.println(context.executeStrategy(5, 10));
        context.setStrategy(new StrategyMultiply());
        System.out.println(context.executeStrategy(5, 10));
    }
}
