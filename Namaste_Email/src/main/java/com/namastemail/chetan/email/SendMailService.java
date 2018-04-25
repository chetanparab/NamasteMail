/**
 * 
 */
package com.namastemail.chetan.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.namastemail.chetan.email.EmailService;

/**
 * @author Chetan Parab
 *
 */
@Component
public class SendMailService implements ApplicationRunner {

	
	@Autowired
	EmailService emailService;
	
	@Override
	
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
	
		sendHtmltMail();
		sendTextMail();
	}
	
	@Scheduled(cron = "0 39 2 ? * *")
	private void sendTextMail() {

		String from = "chetan.parab@capgemini.com";
		String to = "chetan.parab@capgemini.com";
		String cc = "chetan.parab@capgemini.com";
		String subject = "Java Mail with Spring Boot - Plain Text";


		String message = "Heya This is the Mail";

		Email email = new Email(from, to,cc, subject, message);

		emailService.send(email);
	}

	@Scheduled(cron = "0 39 2 ? * *")
	private void sendHtmltMail() {

		String from = "chetan.parab@capgemini.com";
		String to = "chetan.parab@capgemini.com";
		String cc = "chetan.parab@capgemini.com";
		String subject = "Java Mail with Spring Boot - HTML Text";
		String message = "Heya This is the Mail";
		Email email = new Email(from, to,cc, subject, message);
		email.setHtml(true);
		emailService.send(email);
	}

	
	
	

}
