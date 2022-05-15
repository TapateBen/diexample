package com.example.demo.config;

import com.example.demo.services.HelloWorldFactory;
import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceEnglishImpl;
import com.example.demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory () {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish () {
        return helloWorldFactory().createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish () {
        return helloWorldFactory().createHelloWorldService("es");
    }

    @Bean(name = "french")
    public HelloWorldService helloWorldServiceFrench () {
        return helloWorldFactory().createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman () {
        return helloWorldFactory().createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish () {
        return helloWorldFactory().createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian () {
        return helloWorldFactory().createHelloWorldService("ru");
    }
}
