package idistbootcamptima.miniproject;

import idistbootcamptima.miniproject.model.entity.Role;
import idistbootcamptima.miniproject.model.entity.User;
import idistbootcamptima.miniproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@SpringBootApplication
public class MiniProjectApplication {

	//you can add the user data in this class
	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> { //run after the app has initialized
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			//you can add new role here

			userService.saveUser(new User(null,
					"John Travolta",
					"john",
					"1111",
					"111",
					"09811111",
					"john@mail.comm",
					"11111",
					LocalDate.of(2000, Month.APRIL, 29),
					1000000,
					"bri", new ArrayList<>()));
			userService.saveUser(new User(null,
					"Mark Zuckerberg",
					"mark",
					"2222",
					"222",
					"08922222",
					"mark@mail.com",
					"22222",
					LocalDate.of(1998, Month.JUNE, 9),
					20000000,
					"bca",
					new ArrayList<>()));
			userService.saveUser(new User(null,
					"Jim Carey",
					"jim",
					"3333",
					"333",
					"08933333",
					"jim@mail.com",
					"33333",
					LocalDate.of(1996, Month.AUGUST, 11),
					3000000,
					"bri",
					new ArrayList<>()));

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("jim", "ROLE_USER");
			userService.addRoleToUser("mark", "ROLE_USER");
			userService.addRoleToUser("mark", "ROLE_ADMIN");
		};
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
