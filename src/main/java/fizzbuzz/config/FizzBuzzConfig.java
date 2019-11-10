package fizzbuzz.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Configuration class for FizzBuzz application.
 */
public class FizzBuzzConfig {

    @Value("${START_SEQUENCE : 1}")
    private int startSequence;

    @Value("${END_SEQUENCE : 100}")
    private int endSequence;

    public int getStartSequence() {
        return startSequence;
    }

    public int getEndSequence() {
        return endSequence;
    }
}
