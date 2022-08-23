package com.fan.part1.config;

import com.fan.part1.pojo.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("pet")
    public Pet getPet(){
        return new Pet(1,"tom");
    }

}
