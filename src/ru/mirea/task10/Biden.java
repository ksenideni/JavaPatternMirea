package ru.mirea.task10;

import org.springframework.stereotype.Component;

@Component
public class Biden implements Politician {
    @Override
    public String doPolitic() {
        return "Biden is speaking now";
    }
}