package DAY6.C2;

public class Main {
    public static void main(String[] arf){
        Car car1 = new Car("Toyota", "Camry", 50, 5);
        Car car2 = new Car("Honda", "Civic", 40, 4);
        Bike bike1 = new Bike("Schwinn", "Mountain Bike", 20, false);


        RentalAgency rentalAgency = new RentalAgency();

        System.out.println("Vehicle added : Toyota Camry, Honda Civic, Schwinn Mountain Bike");


        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(car2);
        rentalAgency.addVehicle(bike1);


        rentalAgency.displayAvailableVehicles();
        System.out.println("Vehicle rented : Toyota Camry");
        System.out.println("-----------------------");


        rentalAgency.rentVehicle(car1);


        rentalAgency.displayAvailableVehicles();
    }
}
