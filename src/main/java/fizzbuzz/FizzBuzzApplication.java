package fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class to initialize the spring components
 * and starts Spring boot application.
 */
@SpringBootApplication
public class FizzBuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }
}
