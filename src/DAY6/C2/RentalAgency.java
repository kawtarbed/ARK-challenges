package DAY6.C2;

import java.util.ArrayList;
public class RentalAgency {
    private ArrayList<Vehicle> fleet;


    public RentalAgency() {
        fleet = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }


    public void rentVehicle(Vehicle vehicle) {
        fleet.remove(vehicle);
    }


    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : fleet) {
            System.out.println("Make: " + vehicle.getMake());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Rental Price: " + vehicle.getRentalPrice());
            System.out.println("------------------------");
        }
    }

}