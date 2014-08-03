package davenkin.lesson4;

/**
 * Created by Davenkin on 8/3/14.
 */
public class Application {

    public static void main(String[] args){
        CalculatorContext context = new CalculatorContext();
        context.setCalculator(new MathCalculator());
        System.out.println(context.add("12", "23"));

        context.setCalculator(new ConcatCalculator());
        System.out.println(context.add("12","23"));
    }
}
