package fizzbuzz.rules.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fizzbuzz.rules.Rule;

/**
 * This class holds rules for the Game
 * and runs through each rule and returns converted
 * value.
 */
public class RulesProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(RulesProcessor.class);

    private static final String EMPTY = "";

    private final List<Rule> rules;

    /**
     * Instantiates a new Rules processor.
     *
     * @param rules {@link Rule}
     */
    public RulesProcessor(List<Rule> rules) {
        this.rules = rules;
    }

    /**
     * returns converted string from the rule.
     *
     * @param param the number
     * @return the converted string.
     */
    public String print(int param) {
        for (Rule rule : rules) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Processing rule : {}", rule.getClass().getName());
            }
            if (rule.apply(param)) {
                return rule.print(param);
            }
        }
        return EMPTY;
    }
}
