package lecture8;

import lecture5.Rank;
import lecture5.Suit;
import lecture5.flyweight.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// deck to be inherited
public class Deck implements CardSource, Iterable<Card>
{
    private CardStack aCards = new CardStack();

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
     * Draws a card from the deck: removes the card from the top
     * of the deck and returns it.
     * @return The card drawn.
     * @pre !isEmpty()
     */
    public Card draw()
    {
        assert !isEmpty();
        return aCards.pop();
    }

    /**
     * @return True if and only if there are no cards in the deck.
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
}
