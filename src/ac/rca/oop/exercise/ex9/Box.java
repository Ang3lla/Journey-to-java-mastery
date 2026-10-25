package ac.rca.oop.exercise.ex9;

public class Box {

    protected int width;
    protected int height;
    protected int depth;

    public Box() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public Box(int side) {
        this.width = side;
        this.height = side;
        this.depth = side;
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public void display() {
        System.out.println("Box -> width: " + width + ", height: " + height + ", depth: " + depth);
    }
}
