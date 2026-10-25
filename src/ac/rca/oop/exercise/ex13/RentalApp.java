package ac.rca.oop.exercise.ex13;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("RAB 123 A", "Toyota", "Corolla", 40000, 5));
        vehicles.add(new Car("RAC 456 B", "Honda", "Civic", 45000, 4));
        vehicles.add(new Motorcycle("RAD 789 C", "Yamaha", "MT-15", 15000, 155));
        vehicles.add(new Motorcycle("RAE 321 D", "Honda", "CB500", 20000, 500));
        vehicles.add(new Truck("RAF 654 E", "Isuzu", "NPR", 80000, 5.5));

        System.out.println("===== AVAILABLE VEHICLES =====");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println();
            System.out.println("Vehicle number: " + (i + 1));
            vehicles.get(i).displayInfo();
        }

        System.out.println();
        System.out.print("Select a vehicle number: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > vehicles.size()) {
            System.out.println("Invalid vehicle number.");
            scanner.close();
            return;
        }

        System.out.print("Enter number of rental days: ");
        int days = scanner.nextInt();

        if (days <= 0) {
            System.out.println("Days must be greater than zero.");
            scanner.close();
            return;
        }

        Vehicle selected = vehicles.get(choice - 1);

        System.out.println();
        System.out.println("===== RENTAL SUMMARY =====");
        selected.displayInfo();
        System.out.println("Rental days: " + days);
        System.out.println("Total rental cost: " + selected.calculateRentalCost(days));

        scanner.close();
    }
}