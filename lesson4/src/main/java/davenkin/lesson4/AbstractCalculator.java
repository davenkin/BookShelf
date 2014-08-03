package davenkin.lesson4;

/**
 * Created by Davenkin on 8/3/14.
 */
public abstract class AbstractCalculator implements Calculator {
    public static final String ERROR = "ERROR";

    @Override
    public String add(String num1, String num2) {
        if (isValid(num1, num2)) {
            return doAdd(num1, num2);
        }
        return ERROR;
    }

    protected abstract String doAdd(String num1, String num2);

    protected boolean isValid(String num1, String num2) {
        Integer addee = Integer.valueOf(num1);
        Integer adder = Integer.valueOf(num2);
        return addee > 1 && addee < 100 && adder > 1 && adder < 100;
    }
}
