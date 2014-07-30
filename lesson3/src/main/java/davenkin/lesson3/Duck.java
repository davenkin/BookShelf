package davenkin.lesson3;

public class Duck {
    private int weight;

    public void walk() {
        System.out.println("I am " + weight + " in weight.");
        System.out.println("Duck walk!");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
