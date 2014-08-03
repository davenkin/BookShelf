package davenkin.lesson4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddNumbers() {
        Calculator calculator = new Calculator();
        String result = calculator.add("12", "23");
        assertEquals("35", result);
    }

}