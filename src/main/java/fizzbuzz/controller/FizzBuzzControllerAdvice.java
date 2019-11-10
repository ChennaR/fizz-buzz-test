package fizzbuzz.controller;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * This class captures the enum conversion failure exception.
 */
@RestControllerAdvice
public class FizzBuzzControllerAdvice {

    static final String USAGE = "Usage: /fizzbuzz/{ONE|TWO}. ONE or TWO is game stage.";

    @ExceptionHandler({ConversionFailedException.class})
    public ResponseEntity<String> conversionFailedException() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(USAGE);
    }
}
