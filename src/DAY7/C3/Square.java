package DAY7.C3;

public class Square extends Shape {
    private double side;
    public Square(String shapeType,double side) {
        super(shapeType);
        this.side=side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a square.");

    }
}

