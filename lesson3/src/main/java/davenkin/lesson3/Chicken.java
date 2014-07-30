package davenkin.lesson3;

public class Chicken {
    private int weight;

    private String comb;

    public void walk() {
        System.out.println("I am " + weight + " in weight.");
        System.out.println("I have a comb: " + comb);
        System.out.println("Chicken walk!");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }
}
