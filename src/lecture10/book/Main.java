package lecture10.book;

import lecture5.flyweight.Card;

import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args)
    {
        // Sample client code
        Deck deck = new Deck();
        //Main viewer = new Main( () -> deck.peek() );
        //viewer.show();
    }

    private Supplier<Card> aCardSupplier;

    public Main(Supplier<Card> pCardSupplier)
    {
        aCardSupplier = pCardSupplier;
    }

    public void show()
    {
        Card card = aCardSupplier.get();
        // Show the card.
        System.out.println(card);
    }
}