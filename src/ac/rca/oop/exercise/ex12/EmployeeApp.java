package ac.rca.oop.exercise.ex12;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Angella", 200000);

        employee.display();
        System.out.println();

        employee.increaseSalary(10);
        employee.display();
        System.out.println();

        employee.setSalary(-5000);
        employee.display();
    }
}