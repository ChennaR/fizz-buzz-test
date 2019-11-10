package fizzbuzz.service;

import java.util.List;

import fizzbuzz.domain.Stage;

/**
 * This service class to generate sequence.
 */
public interface FizzBuzzService {

    /**
     * Generate sequence string.
     *
     * @param stage {@link Stage}
     * @return result {@link String}
     */
    List<String> generateSequences(Stage stage);

}
