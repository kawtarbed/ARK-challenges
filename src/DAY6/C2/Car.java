package DAY6.C2;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String make, String model, int rentalPrice, int numberOfSeats) {
        super(make, model, rentalPrice);
        this.numberOfSeats = numberOfSeats;

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
