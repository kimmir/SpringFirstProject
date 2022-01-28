package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kim = new Student(
                    "Kim",
                    "Kim@gmail.com",
                    LocalDate.of(2000, MARCH,14)

            );

            Student dave = new Student(
                    "Dave",
                    "Dave@gmail.com",
                    LocalDate.of(2000, AUGUST,28)

            );

            repository.saveAll(
                    List.of(kim,dave)
            );
        };
    }
}
