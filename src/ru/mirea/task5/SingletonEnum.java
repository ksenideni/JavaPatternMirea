package ru.mirea.task5;


public enum SingletonEnum {
    INSTANCE;
    public SingletonEnum getInstance(){
        return  INSTANCE;
    }

}
