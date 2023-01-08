package lecture9;

import lecture5.Rank;
import lecture5.Suit;
import lecture5.flyweight.Card;
import lecture8.CardStack;
import lecture9.visitorPattern.CardSourceVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// added the visitor methods
public class Deck implements CardSource, Iterable<Card>
{
    private CardStack aCards;

    /**
     * Creates a new deck of 52 cards, shuffled.
     */
    public Deck()
    {
        shuffle();
    }

    /**
     * Reinitializes the deck with all 52 cards, and shuffles them.
     */
    public void shuffle()
    {
        List<Card> cards = new ArrayList<>();
        for( Suit suit : Suit.values() )
        {
            for( Rank rank : Rank.values() )
            {
                cards.add( Card.get( rank, suit ));
            }
        }
        Collections.shuffle(cards);
        aCards = new CardStack(cards);
    }

    /**
     * Draws a card from the deck and removes the card from the deck.
     * @return The card drawn.
     * @pre !isEmpty()
     */
    public Card draw()
    {
        assert !isEmpty();
        return aCards.pop();
    }

    /**
     * @return True iff there are no cards in the deck.
     */
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    @Override
    public Iterator<Card> iterator()
    {
        return aCards.iterator();
    }

    @Override
    public void accept(CardSourceVisitor pVisitor)
    {
        pVisitor.visitDeck(this);
    }
}
