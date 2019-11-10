package fizzbuzz.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fizzbuzz.config.FizzBuzzConfig;
import fizzbuzz.domain.Stage;
import fizzbuzz.rules.Rule;
import fizzbuzz.rules.impl.FizzBuzzRulesFactory;
import fizzbuzz.rules.impl.RulesProcessor;
import fizzbuzz.service.FizzBuzzService;

/**
 * Service class to create sequence using integer values.
 * The rules factory provides rules to be used to generate
 * the sequences. The rules set is created based on game stage.
 */
@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzServiceImpl.class);
    //
    private final FizzBuzzConfig fizzBuzzConfig;

    /**
     * Constructor to create FizzBuzzService.
     *
     * @param fizzBuzzConfig {@link FizzBuzzConfig}
     */
    @Autowired
    public FizzBuzzServiceImpl(FizzBuzzConfig fizzBuzzConfig) {
        this.fizzBuzzConfig = fizzBuzzConfig;
    }

    @Override
    public List<String> generateSequences(Stage stage) {
        LOGGER.info("Generating sequences for stage : {}", stage);
        RulesProcessor rulesProcessor = new RulesProcessor(getRules(stage));
        //
        return IntStream.rangeClosed(fizzBuzzConfig.getStartSequence(),
                fizzBuzzConfig.getEndSequence())
                .mapToObj(rulesProcessor::print)
                .collect(Collectors.toList());
    }

    /**
     * Returns rules set based on stage number.
     * Since there are only two stages in the game if
     * it is Stage.ONE it return stageOne rules else
     * stageTwo rules.
     *
     * @param stage {@link Stage}
     * @return {@link Rule} list of rules
     */
    private List<Rule> getRules(Stage stage) {
        return stage == Stage.ONE ?
                FizzBuzzRulesFactory.createStageOneRules() :
                FizzBuzzRulesFactory.createStageTwoRules();
    }
}
