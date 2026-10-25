package ac.rca.oop.exercise.ex13;

public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(String registrationNumber, String brand, String model,
               double rentalPrice, int numberOfSeats) {
        super(registrationNumber, brand, model, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Car");
        super.displayInfo();
        System.out.println("Number of seats: " + numberOfSeats);
    }

    @Override
    public double calculateRentalCost(int days) {
        double seatFee = numberOfSeats * 1000;
        return (getRentalPrice() + seatFee) * days;
    }
}
