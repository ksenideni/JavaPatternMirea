package ru.mirea.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

public class Main {

    static List list;
    static Set set;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        list = context.getBean("list", List.class);
//        Thread thread1=new Thread(()->{
//            for(int i=0; i<100000; i++){
//                list.add(i);
//            }
//        });
//        Thread thread2=new Thread(()->{
//            for(int i=0; i<100000; i++){
//                list.add(i);
//            }
//        });
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list.size());

        set = context.getBean("set", Set.class);
        Thread thread1=new Thread(()->{
            for(int i=0; i<100000; i++){
                set.add(i);
            }
        });
        Thread thread2=new Thread(()->{
            for(int i=0; i<100000; i++){
                set.add(i);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(set.size());
        context.close();
    }
}