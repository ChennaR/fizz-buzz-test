package fizzbuzz.rules;

/**
 * The interface Rule.
 */
public interface Rule {
    /**
     * {@link String} value indicating a number divisible by 3 or number has 3 in it.
     */
    String FIZZ = "Fizz";

    /**
     * {@link String} value indicating a number divisible by 5 or number has 5 in it.
     */
    String BUZZ = "Buzz";

    /**
     * {@link String} value indicating a number divisible by 5 or number has 5 in it.
     */
    String FIZZ_BUZZ = "FizzBuzz";

    /**
     * Checks whether the rule applies to given integer or not.
     *
     * @param param integer value.
     * @return true if applies to rule else false.
     */
    default boolean apply(int param) {
        return true;
    }

    /**
     * prints value based on the rule.
     *
     * @param param integer value which will be printed if rule is not applicable.
     *              else prints rule value.
     * @return the string
     */
    default String print(int param) {
        return String.valueOf(param);
    }
}
