package fizzbuzz.service.impl;

import static org.testng.Assert.assertTrue;

import static fizzbuzz.TestDataHelper.STAGE_ONE_RESULT;
import static fizzbuzz.TestDataHelper.STAGE_TWO_RESULT;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fizzbuzz.config.FizzBuzzConfig;
import fizzbuzz.domain.Stage;
import fizzbuzz.service.FizzBuzzService;

/**
 * Test class for FizzBuzzServiceImplTest.
 */
public class FizzBuzzServiceImplTest {

    private FizzBuzzService fizzBuzzService;

    @BeforeMethod
    public void setUp() {
        FizzBuzzConfig fizzBuzzConfig = new FizzBuzzConfig() {
            public int getStartSequence() {
                return 1;
            }

            public int getEndSequence() {
                return 20;
            }
        };
        fizzBuzzService = new FizzBuzzServiceImpl(fizzBuzzConfig);
    }

    @Test
    public void shouldGenerateSequenceForStageOne() {
        //Given
        //When
        List<String> sequences = fizzBuzzService.generateSequences(Stage.ONE);
        //Then
        assertTrue(sequences.containsAll(STAGE_ONE_RESULT));
    }

    @Test
    public void shouldGenerateSequenceForStageTwo() {
        //Given
        //When
        List<String> sequences = fizzBuzzService.generateSequences(Stage.TWO);
        //Then
        assertTrue(sequences.containsAll(STAGE_TWO_RESULT));
    }
}
