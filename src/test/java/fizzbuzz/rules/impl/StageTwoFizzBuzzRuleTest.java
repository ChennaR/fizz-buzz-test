package fizzbuzz.rules.impl;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Test class for StageTwoFizzBuzzRule.
 */
public class StageTwoFizzBuzzRuleTest {

    @Test
    public void shouldReturnTrueIfNumberIsDivisibleBy3And5() {
        //Given
        StageTwoFizzBuzzRule stageTwoFizzBuzzRule = new StageTwoFizzBuzzRule(
                new StageTwoFizzRule(), new StageTwoBuzzRule());
        //When
        boolean isFizzBuzz = stageTwoFizzBuzzRule.apply(35);
        //Then
        assertTrue(isFizzBuzz);
    }
}
