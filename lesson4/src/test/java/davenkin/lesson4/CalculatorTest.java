package davenkin.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddNumbersMathematically() {
        String result = calculator.add("12", "23");
        assertEquals("35", result);
    }

    @Test
    public void shouldConcatNumbers() {
        String result = calculator.concat("12", "23");
        assertEquals("1223", result);
    }


    @Test
    public void shouldAddNumbersBetween1And100() {
        String result = calculator.add("101", "23");
        assertEquals("ERROR", result);
    }


    @Test
    public void shouldConcatNumbersBetween1And100() {
        String result = calculator.concat("101", "23");
        assertEquals("ERROR", result);
    }

}