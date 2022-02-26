package ru.mirea.task6.abstractFactory;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Select createSelect();
}
