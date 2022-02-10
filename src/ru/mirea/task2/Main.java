package ru.mirea.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(20, "Vasya", "Sidorov", LocalDate.of(2002, 2, 2), 61));
        humanList.add(new Human(20, "Peter", "Pavlov", LocalDate.of(2001, 2, 2), 50));
        humanList.add(new Human(20, "Kolya", "Sorokin", LocalDate.of(2014, 2, 2), 60));
        humanList.add(new Human(20, "Nikita", "Petrov", LocalDate.of(2001, 2, 2), 40));
        humanList.add(new Human(20, "Vania", "Ivanov", LocalDate.of(2021, 2, 2), 60));
        humanList.add(new Human(20, "Kirill", "Smirnov", LocalDate.of(2015, 2, 2), 60));
        humanList.add(new Human(20, "Dima", "Sidorov", LocalDate.of(2001, 2, 2), 60));

        humanList = humanList.stream().limit(5).collect(Collectors.toList());
        System.out.println(humanList);
        humanList = humanList.stream().sorted((c1, c2) -> {
            return -c1.getBirthDate().compareTo(c2.getBirthDate());
        }).collect(Collectors.toList());
        System.out.println(humanList);
        humanList = humanList.stream().filter(w -> w.getWeight() < 60).collect(Collectors.toList());
        System.out.println(humanList);
        humanList.stream().forEach(w -> System.out.println(w.getFirstName() + " " + w.getLastName()));


    }
}
