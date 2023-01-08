package lecture8;

import lecture8.decorator.LoggingDecorator;
import lecture8.inheritance.MemorizingDeck;

/**
 * deck : inheritable
 * memorizing deck: inherits from deck
 * abstract decorator: abstract class contains methods for all decorator classes which inherit from it
 * logging decorator: extends abstract class, overrides additional methods
 * abstract move: template design pattern
 * card move: concrete implementaion of template design pattern
 * deck: to be inherited class (can be instantied)
 */
public class Main {
    public static void main(String args[]){
        Deck d = new Deck();
        MemorizingDeck mem = new MemorizingDeck();
        // not possible: MemorizingDeck mem2 = (MemorizingDeck) new Deck();

        Deck  mem2 = new MemorizingDeck();

        CardSource cs = new Deck();
        CardSource cs2 = new MemorizingDeck();
        CardSource ld= new LoggingDecorator(new Deck());

        ld.draw();
        cs2.draw();
    }

    public static void print(CardSource s){
        while(!s.isEmpty()){
            System.out.println(s.draw().toString());
        }
    }
}
