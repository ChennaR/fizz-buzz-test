package fizzbuzz.rules.impl;

import fizzbuzz.rules.Rule;

/**
 * This Rule is compute if the given integer value
 * is divisible by 3.
 */
class StageOneFizzRule implements Rule {

    /**
     * Checks whether the rule applies to given integer or not.
     *
     * @param param integer value.
     * @return true if applies to rule else false.
     */
    public boolean apply(int param) {
        return param % 3 == 0;
    }

    /**
     * prints value based on the rule.
     *
     * @param param integer value which will be printed if rule is not applicable.
     *              else prints rule value.
     * @return the string
     */
    public String print(int param) {
        return FIZZ;
    }
}
