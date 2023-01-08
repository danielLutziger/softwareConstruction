package lecture9.book;

import lecture5.Rank;
import lecture5.Suit;
import lecture5.flyweight.Card;
import lecture9.book.visitorPattern.*;

/**
 * cardsource : visitable
 * CardSourceVisitor: defines the cardsources which are visitable
 * ChecksContainmentVisitor: a concrete visitor implementation
 * CountingVisitor : a concrete visitor implementation
 * deck: including the "accept" method for visitors
 * Inventory: example for an observable pattern
 *
 */
public class Main
{
    /**
     * Sample use of different visitors.
     */
    public static void main(String[] args)
    {
        CardSource root = createSampleSource();

        // Basic printing
        root.accept(new PrintVisitor());

        // Containment checking
        ChecksContainmentVisitor visitor = new ChecksContainmentVisitor(Card.get(Rank.ACE, Suit.CLUBS));
        root.accept(visitor);
        System.out.println(visitor.contains());
        CardSequence sequence = new CardSequence(Card.get(Rank.EIGHT, Suit.DIAMONDS));
        visitor.reset();
        sequence.accept(visitor);
        System.out.println(visitor.contains());

        // Counts cards
        CountingVisitor visitor2 = new CountingVisitor();
        root.accept(visitor2);
        System.out.println(visitor2.getCount());
        visitor2.reset();
        sequence.accept(visitor2);
        System.out.println(visitor2.getCount());

        // Fancy printing
        root.accept(new StructurePrinterVisitor());
        sequence.accept(new StructurePrinterVisitor());

        // Defining an anonymous visitor which prints the number
        // of cards in card sequences found embedded in the source.
        CardSourceVisitor visitor3 = new AbstractCardSourceVisitor()
        {
            @Override
            public void visitCardSequence(CardSequence pSequence)
            {
                System.out.println(pSequence.size() + " cards");
            }
        };
        root.accept(visitor3);
    }

    private static CardSource createSampleSource()
    {
        CardSequence sequence = new CardSequence(Card.get(Rank.ACE, Suit.CLUBS), Card.get(Rank.ACE, Suit.DIAMONDS),
                Card.get(Rank.ACE, Suit.HEARTS), Card.get(Rank.ACE, Suit.HEARTS));
        CompositeCardSource composite = new CompositeCardSource(new Deck(), sequence);
        return new CompositeCardSource(new Deck(), composite);
    }
}
