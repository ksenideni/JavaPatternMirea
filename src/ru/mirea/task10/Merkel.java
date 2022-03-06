package ru.mirea.task10;

import org.springframework.stereotype.Component;

@Component
public class Merkel implements Politician {
    @Override
    public String doPolitic() {
        return "Merkel is speaking now";
    }
}