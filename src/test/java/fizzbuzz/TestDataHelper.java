package fizzbuzz;

import java.util.Arrays;
import java.util.List;

public interface TestDataHelper {
    /**
     * Sample test data for stage one game for number 1 to 20.
     */
   List<String> STAGE_ONE_RESULT = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
            "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");

    /**
     * Sample test data for stage two game for number 1 to 20.
     */
    List<String> STAGE_TWO_RESULT = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
            "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");
}
