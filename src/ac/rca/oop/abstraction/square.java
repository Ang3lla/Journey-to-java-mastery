package ac.rca.oop.abstraction;

public class  square extends shape {
    private int side;

    public square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
