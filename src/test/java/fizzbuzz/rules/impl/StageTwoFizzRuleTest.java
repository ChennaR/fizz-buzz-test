package fizzbuzz.rules.impl;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link StageTwoFizzRule}.
 */
public class StageTwoFizzRuleTest {

    @Test
    public void shouldReturnTrueNumberHasThreeInIt() {
        //Given
        StageTwoFizzRule stageTwoFizzRule = new StageTwoFizzRule();
        //When
        boolean isFizz = stageTwoFizzRule.apply(13);
        //Then
        Assert.assertTrue(isFizz);
    }
}
