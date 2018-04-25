package com.namastemail.chetan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NamasteEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamasteEmailApplication.class, args);
		System.out.println("Hello Spring boot");
	}
}
