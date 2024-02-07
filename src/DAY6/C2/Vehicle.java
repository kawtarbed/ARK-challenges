package DAY6.C2;

public class Vehicle {
    private String make;
    private String model;
    private int rentalPrice;


    public Vehicle(String make, String model,int rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;

    }

    public void setMake(String newMake){
        System.out.println("make");
    }
    public String getMake() {
        return make;
    }
    public void setModel(String newModel){
        model=newModel;
        System.out.println("Enter the model");
    }
    public String getModel() {
        return model;

    }

    public void setRentalPrice (int newRentalPrice){
        System.out.println("Enter the isbn");
    }

    public int getRentalPrice() {
        return rentalPrice;
    }


}
