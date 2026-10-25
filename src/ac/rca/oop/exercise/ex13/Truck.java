package ac.rca.oop.exercise.ex13;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String registrationNumber, String brand, String model,
                 double rentalPrice, double loadCapacity) {
        super(registrationNumber, brand, model, rentalPrice);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Truck");
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }

    @Override
    public double calculateRentalCost(int days) {
        double loadFee = loadCapacity * 5000;
        return (getRentalPrice() + loadFee) * days;
    }
}