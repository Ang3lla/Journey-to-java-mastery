package ac.rca.oop.exercise.ex11;

public class Person {

    protected int id;
    protected String name;
    protected String identity;
    protected String dob;

    public Person(int id, String name, String identity, String dob) {
        this.id = id;
        this.name = name;
        this.identity = identity;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public String getDob() {
        return dob;
    }

    public void displayPerson() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Identity: " + identity);
        System.out.println("Date of birth: " + dob);
    }
}