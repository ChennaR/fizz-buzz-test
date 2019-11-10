package fizzbuzz.rules.impl;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Test class for StageOneBuzzRule.
 */

public class StageOneBuzzRuleTest {

    @Test
    public void shouldReturnTrueForNumberDivisibleByFive() {
        //Given
        StageOneBuzzRule stageOneBuzzRule = new StageOneBuzzRule();
        //When
        boolean isBuzz = stageOneBuzzRule.apply(10);
        //Then
        assertTrue(isBuzz);
    }

    @Test
    public void shouldReturnFalseForNumberNotDivisibleByFive() {
        //Given
        StageOneBuzzRule stageOneBuzzRule = new StageOneBuzzRule();
        //When
        boolean isBuzz = stageOneBuzzRule.apply(11);
        //Then
        assertFalse(isBuzz);
    }
}
