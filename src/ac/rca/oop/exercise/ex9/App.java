package ac.rca.oop.exercise.ex9;

public class App {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(10, 20, 30);

        BoxWeight bw1 = new BoxWeight();
        BoxWeight bw2 = new BoxWeight(10, 20, 30, 7.5);
        BoxWeight bw3 = new BoxWeight(4, 2.5);

        box1.display();
        box2.display();
        box3.display();

        bw1.display();
        bw2.display();
        bw3.display();
    }
}