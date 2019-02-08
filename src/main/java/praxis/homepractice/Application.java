package praxis.homepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import praxis.homepractice.model.Employee;
import praxis.homepractice.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

         /*
        /books/page/1
        /books/page/2

    --------------------------------

        /books/getNextPage

     */
        SpringApplication.run(Application.class);
    }


    @Bean
    public List<User> getUsers() {
        return new ArrayList<>();
    }

    @Bean
    public List<Employee> getEmployees() {
        return new ArrayList<>();
    }

    @Bean
    public AtomicInteger idValue() {
        return new AtomicInteger(1);
    }


    @Bean

    public Map<String, User> authenticatedUsers() {
        return new HashMap<>();
    }
}
