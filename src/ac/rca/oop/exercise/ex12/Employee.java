package ac.rca.oop.exercise.ex12;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        if (salary < 0) {
            System.out.println("Salary cannot be negative. Setting it to 0.");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            this.salary = salary;
        }
    }

    public void increaseSalary(double percentage) {
        if (percentage < 0) {
            System.out.println("Percentage cannot be negative.");
        } else {
            salary = salary + (salary * percentage / 100);
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}