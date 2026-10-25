package ac.rca.oop.exercise.ex9;

public class BoxWeight extends Box {

    protected double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(int width, int height, int depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void display() {
        System.out.println("BoxWeight -> width: " + width + ", height: " + height
                + ", depth: " + depth + ", weight: " + weight + "kg");
    }
}