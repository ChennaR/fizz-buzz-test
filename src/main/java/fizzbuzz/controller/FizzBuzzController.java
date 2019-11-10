package fizzbuzz.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fizzbuzz.domain.Stage;
import fizzbuzz.service.FizzBuzzService;

/**
 * This class is used to send request to service.
 */
@RestController
public class FizzBuzzController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzController.class);

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @GetMapping(value = "/fizzbuzz/{stage}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> generateSequences(@PathVariable("stage") Stage stage) {
        LOGGER.info("Generating sequences for game stage {}", stage);
        return fizzBuzzService.generateSequences(stage);
    }
}
