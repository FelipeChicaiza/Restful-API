package com.example.mysql_restapi.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfiguration {
    @Bean
    CommandLineRunner commandLine(BookRepository repository){
        return args -> {
            Book Test = new Book(
                    987654321,
                    "TestTitle",
                    "This a test object",
                    "Matt",
                    "fiction",
                    "Intellj",
                    50,
                    2000,
                    500

            );

            Book book2 = new Book(

                    987123321,
                    "Skywalker",
                    "Starwars Ep 1",
                    "Geroge Lucas",
                    "Science fiction",
                    "LucasFilm",
                    15,
                    8.8,
                    2000,
                    200,
                    0.10
            );


            repository.saveAll(
                    List.of(Test, book2)
            );
        };
    }
}
