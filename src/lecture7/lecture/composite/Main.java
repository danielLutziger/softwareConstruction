package lecture7.lecture.composite;


public class Main {
    public static void main(String args[]){

        Shape s = new Square();
        Shape t = new Triangle();
        DrawingComposite q = new DrawingComposite();
        DrawingComposite q2 = new DrawingComposite();

        // can have inifinite loop => composities containing composits
        q.addShape(new Triangle());
        q.addShape(new Square());


        q2.addShape(new Triangle());
        q2.addShape(q);

        s.draw("RED");
        t.draw("BLUE");
        q.draw("BLACK");
        q2.draw("LIME");
    }
}
