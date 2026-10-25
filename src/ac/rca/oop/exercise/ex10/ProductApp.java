package ac.rca.oop.exercise.ex10;

import java.time.LocalDate;

public class ProductApp {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Laptop");
        p1.setSupplier("HP");
        p1.setCost(650000.0);
        p1.setManufactureDate(LocalDate.of(2025, 3, 15));

        Product p2 = new Product(2, "Mouse");
        p2.setSupplier("Logitech");
        p2.setCost(15000.0);
        p2.setManufactureDate(LocalDate.of(2025, 6, 1));

        Product p3 = new Product(3, "Keyboard", "Dell", 25000.0, LocalDate.of(2025, 8, 20));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
