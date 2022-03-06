package ru.mirea.task12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.mirea.task12")
@PropertySource("classpath:/ru/mirea/task12/app12.properties")
public class Config {

}