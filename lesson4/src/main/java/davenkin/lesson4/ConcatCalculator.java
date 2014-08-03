package davenkin.lesson4;

/**
 * Created by Davenkin on 8/3/14.
 */
public class ConcatCalculator implements Calculator {
    public static final String ERROR = "ERROR";

    @Override
    public String add(String num1, String num2) {
        return isValid(num1, num2) ? num1 + num2 : ERROR;
    }


    private boolean isValid(String num1, String num2) {
        Integer addee = Integer.valueOf(num1);
        Integer adder = Integer.valueOf(num2);
        return addee > 1 && addee < 100 && adder > 1 && adder < 100;
    }


}
