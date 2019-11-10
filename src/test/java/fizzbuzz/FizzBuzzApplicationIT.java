package fizzbuzz;

import static org.springframework.http.HttpMethod.GET;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import static fizzbuzz.TestDataHelper.STAGE_ONE_RESULT;
import static fizzbuzz.TestDataHelper.STAGE_TWO_RESULT;

import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import fizzbuzz.domain.Stage;

/**
 * Integration test class for FizzBuzzApplication.
 * this loads application configuration and uses
 * default port.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class FizzBuzzApplicationIT extends AbstractTestNGSpringContextTests {

    private static final String APPLICATION_URI = "http://localhost:8080/fizzbuzz/";

    @Test
    public void shouldGetStageOneSequences() {
        //Given
        //When
        List<String> body = execute(Stage.ONE).getBody();
        //Then
        assertNotNull(body);
        assertTrue(body.containsAll(STAGE_ONE_RESULT));
    }

    @Test
    public void shouldGetStageTwoSequences() {
        //Given
        //When
        List<String> body = execute(Stage.TWO).getBody();
        //Then
        assertNotNull(body);
        assertTrue(body.containsAll(STAGE_TWO_RESULT));
    }

    private ResponseEntity<List<String>> execute(Stage stage) {
        return new TestRestTemplate().exchange(
                APPLICATION_URI + stage,
                GET, new HttpEntity<>(null, new HttpHeaders()),
                new ParameterizedTypeReference<List<String>>() {
                });
    }
}
