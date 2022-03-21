package ru.mirea.task12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;

@Component
public class WorkFile implements CommandLineRunner {
    private File file2;

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @Override
    public void run(String... args) throws Exception {
        File file1 = new File(args[0]);
        file2 = new File(args[1]);
        String content;
        if (file1.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            content = reader.readLine();
            reader.close();
            content = String.valueOf(content.hashCode());
        } else {
            content = "null";
        }
        Writer writer = new FileWriter(file2);
        writer.write(content);
        writer.close();
        System.out.println(content);
        System.out.println("running");
    }

    @PreDestroy
    public void destroy() {
        file2.delete();
        System.out.println("destroy");
    }
}