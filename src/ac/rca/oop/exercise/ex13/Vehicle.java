package ac.rca.oop.exercise.ex13;

public abstract class Vehicle {

    private String registrationNumber;
    private String brand;
    private String model;
    private double rentalPrice;

    public Vehicle(String registrationNumber, String brand, String model, double rentalPrice) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void displayInfo() {
        System.out.println("Registration: " + registrationNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental price per day: " + rentalPrice);
    }

    public abstract double calculateRentalCost(int days);
}