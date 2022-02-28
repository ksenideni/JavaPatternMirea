package ru.mirea.task8.state;

public interface PackageState { //interface will be implemented by each concrete state class
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
