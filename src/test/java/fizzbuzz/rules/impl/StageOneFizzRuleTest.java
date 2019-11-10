package fizzbuzz.rules.impl;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link StageOneFizzRule}.
 */
public class StageOneFizzRuleTest {

    @Test
    public void shouldReturnTrueForNumberDivisibleByThree() {
        //Given
        StageOneFizzRule stageOneFizzRule = new StageOneFizzRule();
        //When
        boolean isFizz = stageOneFizzRule.apply(99);
        //Then
        Assert.assertTrue(isFizz);
    }

    @Test
    public void shouldReturnFalseForNumberNotDivisibleByThree() {
        //Given
        StageOneFizzRule stageOneFizzRule = new StageOneFizzRule();
        //When
        boolean isFizz = stageOneFizzRule.apply(95);
        //Then
        Assert.assertFalse(isFizz);
    }
}
