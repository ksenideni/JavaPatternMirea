package ru.mirea.task5;

public class SingletonStatic {
    private SingletonStatic() {
    }

    public static final SingletonStatic instance=new SingletonStatic();
}
