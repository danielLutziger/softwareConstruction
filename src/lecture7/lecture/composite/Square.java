package lecture7.lecture.composite;

// leaf
public class Square implements Shape{

    @Override
    public void draw(String color) {
        System.out.println("Square with color "+ color);
    }
}
