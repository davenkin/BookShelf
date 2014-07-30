package davenkin.lesson3;

/**
 * Created by Davenkin on 7/30/14.
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setWeight(10);
        duck.walk();

        Chicken chicken = new Chicken();
        chicken.setWeight(20);
        chicken.setComb("Beautiful comb");
        chicken.walk();
    }

}
