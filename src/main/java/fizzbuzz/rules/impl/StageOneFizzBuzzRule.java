package fizzbuzz.rules.impl;

import fizzbuzz.rules.Rule;

/**
 * This Rule checks whether both FizzRule {@link StageOneFizzRule} and
 * BuzzRule {@link StageOneBuzzRule} applies to integer value or not.
 */
class StageOneFizzBuzzRule implements Rule {

    private final StageOneFizzRule stageOneFizzRule;
    private final StageOneBuzzRule stageOneBuzzRule;

    /**
     * Constructor to FizzBuzzRule.
     *
     * @param stageOneFizzRule {@link StageOneFizzRule}
     * @param stageOneBuzzRule {@link StageOneBuzzRule}
     */
    StageOneFizzBuzzRule(StageOneFizzRule stageOneFizzRule, StageOneBuzzRule stageOneBuzzRule) {
        this.stageOneFizzRule = stageOneFizzRule;
        this.stageOneBuzzRule = stageOneBuzzRule;
    }

    /**
     * Checks whether the rule applies to given integer or not.
     *
     * @param param integer value.
     * @return true if applies to rule else false.
     */
    public boolean apply(int param) {
        return stageOneFizzRule.apply(param) && stageOneBuzzRule.apply(param);
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
