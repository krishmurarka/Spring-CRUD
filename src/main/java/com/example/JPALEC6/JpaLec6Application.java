package com.example.JPALEC6;

import com.example.JPALEC6.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaLec6Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaLec6Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save();
		//to remove temp files
	}
}
