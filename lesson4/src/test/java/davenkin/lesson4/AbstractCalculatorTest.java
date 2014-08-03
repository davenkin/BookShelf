package davenkin.lesson4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractCalculatorTest {

    @Test
    public void shouldAddNumbers() {
        AbstractCalculator calculator = new AbstractCalculator() {
            @Override
            protected String doAdd(String num1, String num2) {
                return num1 + num2;
            }
        };

        String result = calculator.add("12", "23");
        assertEquals("1223", result);
    }


    @Test
    public void shouldGetERRORWhenNumbersNotBetween1And100() {
        AbstractCalculator calculator = new AbstractCalculator() {
            @Override
            protected String doAdd(String num1, String num2) {
                return null;
            }
        };
        String result = calculator.add("101", "23");
        assertEquals("ERROR", result);
    }


}