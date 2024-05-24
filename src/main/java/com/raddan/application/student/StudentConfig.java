package com.raddan.application.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sasha = new Student(
                    "Sasha",
                    "rainaddan104@gmail.com",
                    LocalDate.of(2006, Month.SEPTEMBER, 1)
            );

            Student ilya = new Student(
                    "Ilya",
                    "ilyajjk@gmail.com",
                    LocalDate.of(2005, Month.JANUARY, 26)
            );

            repository.saveAll(
                    List.of(sasha, ilya)
            );
        };
    }

}
