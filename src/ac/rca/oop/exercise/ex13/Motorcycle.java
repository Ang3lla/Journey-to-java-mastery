package ac.rca.oop.exercise.ex13;

public class Motorcycle extends Vehicle {

    private int engineCapacity;

    public Motorcycle(String registrationNumber, String brand, String model,
                      double rentalPrice, int engineCapacity) {
        super(registrationNumber, brand, model, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Motorcycle");
        super.displayInfo();
        System.out.println("Engine capacity: " + engineCapacity + "cc");
    }

    @Override
    public double calculateRentalCost(int days) {
        double total = getRentalPrice() * days;
        return total - (total * 0.10);
    }
}