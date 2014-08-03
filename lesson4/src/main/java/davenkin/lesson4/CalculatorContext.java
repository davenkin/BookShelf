package davenkin.lesson4;

/**
 * Created by Davenkin on 8/3/14.
 */
public class CalculatorContext implements Calculator {

    private Calculator calculator;


    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String add(String num1, String num2) {
        return calculator.add(num1, num2);
    }

}
