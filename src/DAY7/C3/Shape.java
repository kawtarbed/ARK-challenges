package DAY7.C3;

public abstract class Shape implements Drawable {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public double calculateArea() {

        return 0;
    }


    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }
}
