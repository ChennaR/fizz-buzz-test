package fizzbuzz.rules.impl;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Test class for StageOneFizzBuzzRule.
 */
public class StageOneFizzBuzzRuleTest {

    @Test
    public void shouldReturnTrueIfNumberIsDivisibleBy3And5() {
        //Given
        StageOneFizzBuzzRule stageOneFizzBuzzRule = new StageOneFizzBuzzRule(
                new StageOneFizzRule(), new StageOneBuzzRule());
        //When
        boolean isFizzBuzz = stageOneFizzBuzzRule.apply(15);
        //Then
        assertTrue(isFizzBuzz);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleBy3Or5() {
        //Given
        StageOneFizzBuzzRule stageOneFizzBuzzRule = new StageOneFizzBuzzRule(
                new StageOneFizzRule(), new StageOneBuzzRule());
        //When
        boolean isFizzBuzz = stageOneFizzBuzzRule.apply(17);
        //Then
        assertFalse(isFizzBuzz);
    }
}
