package ac.rca.oop.exercise.ex6;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Angella", 20);
        User user2 = new User("Robert", 21);
        User user3 = new User("Stella", 19);

        System.out.println("Name: " + user1.getName() + ", Age: " + user1.getAge());
        System.out.println("Name: " + user2.getName() + ", Age: " + user2.getAge());
        System.out.println("Name: " + user3.getName() + ", Age: " + user3.getAge());
    }
}