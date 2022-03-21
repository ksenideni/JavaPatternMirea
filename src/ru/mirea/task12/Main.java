package ru.mirea.task12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        //program args: src/ru/mirea/task12/filesystem/data.txt src/ru/mirea/task12/filesystem/hashdata.txt
    }
}
