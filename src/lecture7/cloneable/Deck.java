package lecture7.cloneable;

import lecture5.Rank;
import lecture5.Suit;
import lecture5.flyweight.Card;
import lecture7.CardStack;
import lecture7.command.Command;

import java.util.*;

/**
 * - obtained by client code using an immutable wrapper object
 *
 * - cloneable
 * - iterateable
 */
public class Deck implements CardSource, Iterable<Card>, Cloneable
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
     * Places pCard on top of the deck.
     * @param pCard The card to place on top
     * of the deck.
     * @pre pCard !=null
     */
    public void push(Card pCard)
    {
        assert pCard != null;
        aCards.push(pCard);
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

    public Deck clone()
    {
        try
        {
            Deck clone = (Deck) super.clone();
            clone.aCards = new CardStack(clone.aCards);
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            assert false;
            return null;
        }
    }

    /**
     * Sample command factory method.
     *
     * @return A command to draw a card from the deck.
     */
    public Command createDrawCommand()
    {
        return new Command()
        {
            Card aDrawn = null;

            public Optional<Card> execute()
            {
                aDrawn = draw();
                return Optional.of(aDrawn);
            }

            public void undo()
            {
                aCards.push(aDrawn);
                aDrawn = null;
            }
        };
    }
}