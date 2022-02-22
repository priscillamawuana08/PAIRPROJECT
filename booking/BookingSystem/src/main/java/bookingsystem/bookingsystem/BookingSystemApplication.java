package bookingsystem.bookingsystem;

import bookingsystem.bookingsystem.Model.AppUser;
import bookingsystem.bookingsystem.Model.Role;
import bookingsystem.bookingsystem.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class BookingSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookingSystemApplication.class, args);
    }



      @Bean
      CommandLineRunner run(UserService userService){
                return args -> {
                    userService.saveRole(new Role(1,"ROLE_USER"));
                    userService.saveRole(new Role(2,"ROLE_MANAGER"));
                    userService.saveRole(new Role(3,"ROLE_ADMIN"));
                    userService.saveRole(new Role(4,"ROLE_SUPER_ADMIN"));


                    userService.saveUser(new AppUser("Priscilla Bonsu", "Sam","1234",new ArrayList<>()));
                    userService.saveUser(new AppUser("Samuel Afotey", "Mike","1234",new ArrayList<>()));
                    userService.saveUser(new AppUser("Tornyie Micheal", "HR","1234",new ArrayList<>()));
                    userService.saveUser(new AppUser("Timothy Awarika" , "Flexzy","1234",new ArrayList<>()));



                    userService.addRoleToAppUser("Sam", "ROLE_USER");
                    userService.addRoleToAppUser("Mike","ROLE_MANAGER" );
                    userService.addRoleToAppUser("HR","ROLE_ADMIN");
                    userService.addRoleToAppUser("Flexzy","ROLE_SUPER_ADMIN");
                    userService.addRoleToAppUser("Mike","ROLE_USER" );
                    userService.addRoleToAppUser("HR","ROLE_MANAGER");


                };
        }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(args);

    }
}
