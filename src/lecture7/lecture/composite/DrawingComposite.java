package lecture7.lecture.composite;

import java.util.ArrayList;
import java.util.List;

// composite
// shape that is composed of different shapes (composite)
public class DrawingComposite implements Shape {

    // keep track of shapes that this object is made of
    private List<Shape> shapes = new ArrayList<>();

    // creation of the composite:
    // 1) provide methods to add new shapes
    public void addShape(Shape s){
        shapes.add(s);
    }

    public void removeShape(Shape s){
        shapes.remove(s);
    }

    public DrawingComposite(){}

    // 2) add shapes with constructor
    public DrawingComposite(List<Shape> s){
        shapes = s;
    }

    @Override
    public void draw(String color) {
        // has to be drawn by all the sub parts
        for (Shape s : shapes){
            s.draw(color);
        }
    }
}
