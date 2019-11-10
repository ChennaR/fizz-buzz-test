package fizzbuzz.rules.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fizzbuzz.rules.Rule;

/**
 * Factory to create FizzBuzz using the set of rules.
 */
public class FizzBuzzRulesFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzRulesFactory.class);

    /**
     * create stage one rules for generating sequence.
     *
     * @return {@link List} list of rules.
     */
    public static List<Rule> createStageOneRules() {
        LOGGER.info("Creating rules for Stage One");
        StageOneFizzRule stageOneFizzRule = new StageOneFizzRule();
        StageOneBuzzRule stageOneBuzzRule = new StageOneBuzzRule();
        return Arrays.asList(
                new StageOneFizzBuzzRule(stageOneFizzRule, stageOneBuzzRule),
                stageOneFizzRule,
                stageOneBuzzRule,
                new DefaultRule()
        );
    }

    /**
     * create stage two rules for generating sequence.
     *
     * @return {@link List} list of rules.
     */
    public static List<Rule> createStageTwoRules() {
        LOGGER.info("Creating rules for Stage Two");
        StageTwoFizzRule stageTwoFizzRule = new StageTwoFizzRule();
        StageTwoBuzzRule stageTwoBuzzRule = new StageTwoBuzzRule();
        return Arrays.asList(
                new StageTwoFizzBuzzRule(stageTwoFizzRule, stageTwoBuzzRule),
                stageTwoFizzRule,
                stageTwoBuzzRule,
                new DefaultRule()
        );
    }
}
