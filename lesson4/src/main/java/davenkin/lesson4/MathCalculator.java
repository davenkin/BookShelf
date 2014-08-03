package davenkin.lesson4;

/**
 * Created by Davenkin on 8/3/14.
 */
public class MathCalculator extends AbstractCalculator {

    @Override
    protected String doAdd(String num1, String num2) {
        return String.valueOf(Integer.valueOf(num1) + Integer.valueOf(num2));
    }

}
