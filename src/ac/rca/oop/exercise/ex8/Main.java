package ac.rca.oop.exercise.ex8;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Angella", 20);
        User u2 = new User("Robert", 21);
        User u3 = new User("Angella", 20);

        System.out.println("u1 == u3 : " + (u1 == u3));
        System.out.println("u1.equals(u3) : " + u1.equals(u3));
        System.out.println("u1.equals(u2) : " + u1.equals(u2));
    }
}