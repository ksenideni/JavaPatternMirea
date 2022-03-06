package ru.mirea.task13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String last_name;
    @Value("${student.group}")
    private String group;

    public void print(){
        System.out.println(name + "\n" + last_name + "\n" + group);
    }

    public String getName() {
        return name;
    }

//    public String getLastName() {
//        return lastName;
//    }

    public String getGroup() {
        return group;
    }
}
