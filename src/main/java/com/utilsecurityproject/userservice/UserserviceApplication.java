package com.utilsecurityproject.userservice;

import com.utilsecurityproject.userservice.domain.AppUser;
import com.utilsecurityproject.userservice.domain.Role;
import com.utilsecurityproject.userservice.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	//This bean of type CommandLineRunner is used here to populate the database with data when the application is initialized
	//and the UserService is injected to it
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(null, "name1", "u_n1", "1234", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "name2", "u_n2", "1234", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "name3", "u_n3", "1234", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "name4", "u_n4", "1234", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "name5", "u_n5", "1234", new ArrayList<>()));

			userService.addRoleToUser("u_n1", "ROLE_USER");
			userService.addRoleToUser("u_n1", "ROLE_Manager");
			userService.addRoleToUser("u_n1", "ROLE_ADMIN");
			userService.addRoleToUser("u_n2", "ROLE_USER");
			userService.addRoleToUser("u_n2", "ROLE_ADMIN");
			userService.addRoleToUser("u_n3", "ROLE_USER");
			userService.addRoleToUser("u_n4", "ROLE_USER");
			userService.addRoleToUser("u_n5", "ROLE_SUPER_ADMIN");

		};
	}
}
