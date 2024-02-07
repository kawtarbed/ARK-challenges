package DAY7.C3;

import java.util.*;
public class DrawingBoard {
    private ArrayList<Drawable> shapes=new ArrayList<>();
    public DrawingBoard() {
        shapes.add(new Triangle("triangle 1",15.00,27.00));
        shapes.add(new Triangle("triangle 2",5.00,14.00));
        shapes.add(new Square("square",21.00));


    }
    public void drawShapes() {
        for (Drawable shape : shapes) {
            shape.drawShape();
        }
    }

    public void displayShapeTypes() {
        for (Drawable shape : shapes) {
            if (shape instanceof Shape) {
                ((Shape) shape).displayShapeType();
            }
        }
    }

    public void calculateArea() {
        for (Drawable shape : shapes) {
            System.out.println("area: "+shape.calculateArea());

        }
    }
}
