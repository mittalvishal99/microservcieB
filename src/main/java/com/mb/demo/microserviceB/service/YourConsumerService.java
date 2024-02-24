package com.mb.demo.microserviceB.service;// YourConsumerService.java

import com.mb.demo.microserviceB.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.*;

@Service
public class YourConsumerService {

    String STUDENT_API_URL = "http://localhost:8080/api/students"; // Change the URL based on your actual endpoint

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;

    public void createStudent(Student student) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Student> request = new HttpEntity<>(student, headers);

        // ResponseEntity<Random> response = restTemplate.postForEntity(STUDENT_API_URL, request, Random.class);
        ResponseEntity<String> response = restTemplate.postForEntity(STUDENT_API_URL, request, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Student created successfully");
        } else {
            System.out.println("Error creating student. HTTP Status: " + response.getStatusCode());
        }


   /* public Student createStudent(Student student) {
        Student s = webClientBuilder.build()
                .post()
                .uri(STUDENT_API_URL)
                .header(HttpHeaders.CONTENT_TYPE)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(student))
                .retrieve()
                .bodyToMono(Student.class)
                .block();

        return s;
    }*/
    }
}

