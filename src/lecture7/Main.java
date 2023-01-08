package lecture7;

import lecture7.Composite.CompositeCardSource;
import lecture7.Decorator.LoggingDeck;
import lecture7.Decorator.LoggingDecorator;
import lecture7.Decorator.MemorizingDecorator;
import lecture7.cloneable.CardSource;
import lecture7.cloneable.Deck;

/**
 * deck: cloneable
 * cardsource: cloneable interface (all classes implementing it are cloneable)
 * command: interface for a command pattern
 * compositecardsource: example of a composite pattern
 * loggingdeck: not a decorator pattern
 * logging decorator: example of a decorator pattern
 * memorizing decorator: example of a decorator pattern
 * card source maanger: representation of a prototype pattern
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
    }

    public static void print(CardSource s){
        while(!s.isEmpty()){
            System.out.println(s.draw().toString());
        }
    }
}
