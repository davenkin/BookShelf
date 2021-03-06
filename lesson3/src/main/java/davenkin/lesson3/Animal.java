package davenkin.lesson3;

/**
 * Created by Davenkin on 7/30/14.
 */
public abstract class Animal implements Walkable {
    protected int weight;

    @Override
    public abstract void walk();

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
