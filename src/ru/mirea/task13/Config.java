package ru.mirea.task13;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.mirea.task13")
@PropertySource(value="classpath:/ru/mirea/task13/application.yml",  factory = YamlPropertySourceFactory.class)

public class Config {
}
