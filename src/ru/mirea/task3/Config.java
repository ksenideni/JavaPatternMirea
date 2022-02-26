package ru.mirea.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.*;

@Configuration
@ComponentScan("ru.mirea.task3")
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public List list(){
        return new LinkedList();
    }
    @Bean
    public Set set(){
        return new HashSet();
    }
}
