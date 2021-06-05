package com.example.learning;

import static com.example.learning.constants.ApplicationUserPermission.*;
import static com.example.learning.constants.ApplicationUserRole.*;
import com.example.learning.domains.User;
import com.example.learning.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}
	/**
	@Bean
	CommandLineRunner commandLineRunner(UserRepository repository, PasswordEncoder passwordEncoder) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				String[] authorities = {
						VOTE_WRITE.name(),
						VOTE_READ.name()
				};
				User user = new User(
						"brulure123",
						passwordEncoder.encode("23617252"),
						"Zongwe Benoni Benjamin",
						ELECTOR.name(),
						authorities,
						false
				);
				repository.save(user);
			}
		};
	}
	*/

}
