package fizzbuzz.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static fizzbuzz.TestDataHelper.STAGE_ONE_RESULT;
import static fizzbuzz.TestDataHelper.STAGE_TWO_RESULT;
import static fizzbuzz.controller.FizzBuzzControllerAdvice.USAGE;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fizzbuzz.config.FizzBuzzConfig;
import fizzbuzz.service.FizzBuzzService;
import fizzbuzz.service.impl.FizzBuzzServiceImpl;

/**
 * Test class for FizzBuzzController.
 */
public class FizzBuzzControllerTest {

    private MockMvc mockMvc;

    @BeforeMethod
    public void setUp() {
        FizzBuzzService fizzBuzzService = createFizzBuzzService();
        FizzBuzzController fizzBuzzController = new FizzBuzzController();
        ReflectionTestUtils.setField(fizzBuzzController, "fizzBuzzService", fizzBuzzService);
        //
        mockMvc = MockMvcBuilders.standaloneSetup(fizzBuzzController)
                .setControllerAdvice(new FizzBuzzControllerAdvice())
                .build();
    }

    @Test
    public void shouldReturnFizzBuzzSequenceForStageOne() throws Exception {
        //Given
        //When
        mockMvc.perform(get("/fizzbuzz/ONE"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.notNullValue()))
                .andExpect(jsonPath("$", Matchers.hasSize(20)))
                .andExpect(jsonPath("$.*", Matchers.isA(ArrayList.class)))
                .andExpect(jsonPath("$.*", Matchers.equalTo(STAGE_ONE_RESULT)))
                .andReturn();
        //Then
    }

    @Test
    public void shouldReturnFizzBuzzSequenceForStageTwo() throws Exception {
        //Given
        //When
        mockMvc.perform(get("/fizzbuzz/TWO"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(20)))
                .andExpect(jsonPath("$.*", Matchers.isA(ArrayList.class)))
                .andExpect(jsonPath("$.*", Matchers.equalTo(STAGE_TWO_RESULT)))
                .andReturn();
        //Then
    }

    @Test
    public void shouldThrowExceptionIfGameStageNotFound() throws Exception {
        //Given
        //When
        mockMvc.perform(get("/fizzbuzz/THREE"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$", Matchers.notNullValue()))
                .andExpect(jsonPath("$", Matchers.equalTo(USAGE)))
                .andReturn();
        //Then
    }

    private FizzBuzzServiceImpl createFizzBuzzService() {
        return new FizzBuzzServiceImpl(new FizzBuzzConfig() {
            @Override
            public int getStartSequence() {
                return 1;
            }

            @Override
            public int getEndSequence() {
                return 20;
            }
        });
    }
}
