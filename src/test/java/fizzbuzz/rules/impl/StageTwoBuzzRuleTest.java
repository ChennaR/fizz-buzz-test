package fizzbuzz.rules.impl;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Test class for StageTwoBuzzRule.
 */
public class StageTwoBuzzRuleTest {

    @Test
    public void shouldReturnTrueIfNumberHasFiveInIt() {
        //Given
        StageTwoBuzzRule stageTwoBuzzRule = new StageTwoBuzzRule();
        //When
        boolean isBuzz = stageTwoBuzzRule.apply(57);
        //Then
        assertTrue(isBuzz);
    }
}
