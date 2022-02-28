package ru.mirea.task8.state;

public class Test {
    public static void main(String[] args) {//поток в отличие от стратегии
        Package pkg=new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.previousState();
        pkg.printStatus();

    }
}
