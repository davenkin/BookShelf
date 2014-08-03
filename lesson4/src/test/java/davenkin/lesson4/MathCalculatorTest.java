package davenkin.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathCalculatorTest {

    private MathCalculator mathCalculator;

    @Before
    public void setUp() throws Exception {
        mathCalculator = new MathCalculator();
    }

    @Test
    public void shouldAddNumbersMathematically() {
        String result = mathCalculator.add("12", "23");
        assertEquals("35", result);
    }


    @Test
    public void shouldAddNumbersBetween1And100() {
        String result = mathCalculator.add("101", "23");
        assertEquals("ERROR", result);
    }

}