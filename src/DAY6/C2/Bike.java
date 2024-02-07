package DAY6.C2;

class Bike extends Vehicle {
    private boolean isElectric;
    public Bike(String make, String model, int rentalPrice,boolean isElectric) {
        super(make, model, rentalPrice);
        this.isElectric=isElectric;
    }
    public boolean isElectric() {
        return isElectric;
    }
    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }


}
