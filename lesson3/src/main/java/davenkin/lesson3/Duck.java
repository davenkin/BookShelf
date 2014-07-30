package davenkin.lesson3;

public class Duck extends Animal {

    @Override
    public void walk() {
        System.out.println("I am " + weight + " in weight.");
        System.out.println("Duck walk!");
    }

}
