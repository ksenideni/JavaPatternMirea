package ru.mirea.task10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

//        program args: biden merkel trump
        Politician politician = annotationConfigApplicationContext.getBean(args[2], Politician.class);
        System.out.println(politician.doPolitic());

        annotationConfigApplicationContext.close();
    }
}
