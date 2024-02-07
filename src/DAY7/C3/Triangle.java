package DAY7.C3;

public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(String shapeType, double base,double height) {
        super(shapeType);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing a Triangle");
    }


}
