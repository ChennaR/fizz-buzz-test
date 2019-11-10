package fizzbuzz.rules.impl;

import fizzbuzz.rules.Rule;

/**
 * This Rule checks whether both FizzRule {@link StageTwoFizzRule} and
 * BuzzRule {@link StageTwoBuzzRule} applies to integer value or not.
 */
class StageTwoFizzBuzzRule implements Rule {

    private final StageTwoFizzRule stageTwoFizzRule;
    private final StageTwoBuzzRule stageTwoBuzzRule;

    /**
     * Constructor to FizzBuzzRule.
     *
     * @param stageTwoFizzRule {@link StageTwoFizzRule}
     * @param stageTwoBuzzRule {@link StageTwoBuzzRule}
     */
    StageTwoFizzBuzzRule(StageTwoFizzRule stageTwoFizzRule, StageTwoBuzzRule stageTwoBuzzRule) {
        this.stageTwoFizzRule = stageTwoFizzRule;
        this.stageTwoBuzzRule = stageTwoBuzzRule;
    }

    /**
     * Checks whether the rule applies to given integer or not.
     *
     * @param param integer value.
     * @return true if applies to rule else false.
     */
    public boolean apply(int param) {
        return stageTwoFizzRule.apply(param) && stageTwoBuzzRule.apply(param);
    }

    /**
     * prints value based on the rule.
     *
     * @param param integer value which will be printed if rule is not applicable.
     *              else prints rule value.
     * @return the string
     */
    public String print(int param) {
        return FIZZ_BUZZ;
    }
}
