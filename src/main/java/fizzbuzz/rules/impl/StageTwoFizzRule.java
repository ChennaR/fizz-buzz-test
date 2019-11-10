package fizzbuzz.rules.impl;

/**
 * This Rule is compute if the given integer value
 * is divisible by 3 or 3 is in it.
 */
class StageTwoFizzRule extends StageOneFizzRule {
    /**
     * Checks whether the rule applies to given integer or not.
     *
     * @param param integer value.
     * @return true if applies to rule else false.
     */
    public boolean apply(int param) {
        return super.apply(param) ||
                String.valueOf(param).chars()
                        .map(Character::getNumericValue)
                        .anyMatch(number -> number == 3);
    }
}
