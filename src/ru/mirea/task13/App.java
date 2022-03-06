package ru.mirea.task13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Service service = context.getBean("service", Service.class);
       service.print();
        context.close();
    }
}
