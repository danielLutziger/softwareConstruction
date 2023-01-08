package lecture7;

import lecture7.book.Composite.CompositeCardSource;
import lecture7.book.Decorator.LoggingDeck;
import lecture7.book.Decorator.LoggingDecorator;
import lecture7.book.Decorator.MemorizingDecorator;
import lecture7.book.cloneable.CardSource;
import lecture7.book.cloneable.Deck;
import lecture7.lecture.composite.DrawingComposite;
import lecture7.lecture.composite.Shape;
import lecture7.lecture.composite.Square;
import lecture7.lecture.composite.Triangle;

/**
 * deck: cloneable
 * cardsource: cloneable interface (all classes implementing it are cloneable)
 * command: interface for a command pattern
 * compositecardsource: example of a composite pattern
 * loggingdeck: not a decorator pattern
 * logging decorator: example of a decorator pattern
 * memorizing decorator: example of a decorator pattern
 * card source maanger: representation of a prototype pattern
 *
 * lecture: - drawing composite / square leaf / square triangle
 *
 */
public class Main {
    public static void main(String args[]){
        Deck d = new Deck();
        CompositeCardSource c = new CompositeCardSource();
        LoggingDeck ld = new LoggingDeck();
        LoggingDecorator l = new LoggingDecorator(d);
        MemorizingDecorator m = new MemorizingDecorator(d);

        print(c);
        print(ld);
        print(l);
        print(m);

        /**
         * lecture content
         */
        System.out.println("===============================================================");

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

    public static void print(CardSource s){
        while(!s.isEmpty()){
            System.out.println(s.draw().toString());
        }
    }
}
