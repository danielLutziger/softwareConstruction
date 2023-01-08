package lecture8;

import lecture5.flyweight.Card;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardStack implements Iterable<Card>
{
    private final List<Card> aCards;

    public CardStack()
    {
        aCards = new ArrayList<>();
    }


    public CardStack(Iterable<Card> pCards)
    {
        aCards = new ArrayList<>();
        for( Card card : pCards )
        {
            aCards.add(card);
        }
    }

    /**
     * Adds a card to the stack.
     * @param pCard The card to add
     * @pre pCard != null
     */
    public void push(Card pCard)
    {
        assert pCard != null && !aCards.contains(pCard);
        aCards.add(pCard);
    }

    /**
     * Removes the card at the top of the stack and returns it.
     *
     * @return The card formerly at the top of the stack.
     * @pre !isEmpty()
     */
    public Card pop()
    {
        assert !isEmpty();
        return aCards.remove(aCards.size() - 1);
    }

    /**
     * @return The card at the top of the stack.
     * @pre !isEmpty()
     */
    public Card peek()
    {
        assert !isEmpty();
        return aCards.get(aCards.size() - 1);
    }

    /**
     * Remove all cards from the stack.
     */
    public void clear()
    {
        aCards.clear();
    }

    /**
     * @return True if there are no cards in the stack.
     */
    public boolean isEmpty()
    {
        return aCards.size() == 0;
    }

    @Override
    public Iterator<Card> iterator() { return aCards.iterator(); }
}