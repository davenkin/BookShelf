package davenkin.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcatCalculatorTest {

    private ConcatCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new ConcatCalculator();
    }

    @Test
    public void shouldAddNumbers() {
        String result = calculator.add("12", "23");
        assertEquals("1223", result);
    }


}