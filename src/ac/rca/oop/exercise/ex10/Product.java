package ac.rca.oop.exercise.ex10;

import java.time.LocalDate;

public class Product {

    private int id;
    private String name;
    private String supplier;
    private double cost;
    private LocalDate manufactureDate;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, String supplier, double cost, LocalDate manufactureDate) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.cost = cost;
        this.manufactureDate = manufactureDate;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', supplier='" + supplier
                + "', cost=" + cost + ", manufactureDate=" + manufactureDate + "}";
    }
}