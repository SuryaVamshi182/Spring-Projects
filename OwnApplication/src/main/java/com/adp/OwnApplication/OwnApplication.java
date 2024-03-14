package com.adp.OwnApplication;

import com.adp.OwnApplication.Entity.Student;
import com.adp.OwnApplication.Repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OwnApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnApplication.class, args);
	}
}
