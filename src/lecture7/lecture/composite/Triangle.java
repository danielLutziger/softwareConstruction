package lecture7.lecture.composite;

// leaf
public class Triangle implements Shape{

    @Override
    public void draw(String color) {
        System.out.println("Triangle with color "+ color);
    }
}
