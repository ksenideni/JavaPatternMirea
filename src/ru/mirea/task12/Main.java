package ru.mirea.task12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

        WorkFile file=annotationConfigApplicationContext.getBean("file", WorkFile.class);

        System.out.println("main is ready to work");
        try {
            //imitation of work
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        annotationConfigApplicationContext.close();
    }
}
