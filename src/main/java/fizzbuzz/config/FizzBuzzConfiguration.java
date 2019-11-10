package fizzbuzz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class creates configuration bean for
 * FizzBuzz spring boot application.
 */
@Configuration
class FizzBuzzConfiguration {

    @Bean
    public FizzBuzzConfig fizzBuzzConfig() {
        return new FizzBuzzConfig();
    }
}
