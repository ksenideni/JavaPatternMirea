package ru.mirea.task10;

import org.springframework.stereotype.Component;

@Component
public class Trump implements Politician {
    @Override
    public String doPolitic() {
        return "Trump is speaking now";
    }
}
