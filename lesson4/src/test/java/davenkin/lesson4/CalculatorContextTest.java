package davenkin.lesson4;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CalculatorContextTest {

    @Test
    public void shouldAddNumbers() {
        String num1 = "12";
        String num2 = "23";
        String expected = "1223";

        CalculatorContext context = new CalculatorContext();
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.add(num1, num2)).thenReturn(expected);
        context.setCalculator(calculator);

        String result = context.add(num1, num2);

        assertEquals(expected, result);
        Mockito.verify(calculator).add(num1, num2);
    }

}