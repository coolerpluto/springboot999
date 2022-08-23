package com.fan.part1;

import com.fan.part1.pojo.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Part1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Part1Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for ( String beanName : beanDefinitionNames ){
            System.out.println(beanName);
        }
        System.out.println("********************分割线***********************");
        Pet petOne = run.getBean("pet", Pet.class);
        System.out.println(petOne);
    }

}
