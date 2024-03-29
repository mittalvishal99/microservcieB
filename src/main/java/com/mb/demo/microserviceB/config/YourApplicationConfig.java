package com.mb.demo.microserviceB.config;// YourApplicationConfig.java or YourServiceClass.java

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.*;

@Configuration
public class YourApplicationConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
//some changes
    //more changes
    //chnages 2
    //changes 3
    //changes 4
    //more change 5
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
