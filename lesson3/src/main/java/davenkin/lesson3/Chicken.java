package davenkin.lesson3;

public class Chicken extends Animal {
    private String comb;

    public void walk() {
        System.out.println("I am " + weight + " in weight.");
        System.out.println("I have a comb: " + comb);
        System.out.println("Chicken walk!");
    }

    public void setComb(String comb) {
        this.comb = comb;
    }
}
