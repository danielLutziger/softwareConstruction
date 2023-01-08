package lecture3;

import java.util.*;

/**
 * ITERATOR DESIGN PATTERN
 * COMPARATOR
 */
public class Deck implements CardSource, Iterable<Card>
{
    private List<Card> aCards = new ArrayList<>();

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
        aCards.clear();
        for( Suit suit : Suit.values() )
        {
            for( Rank rank : Rank.values() )
            {
                aCards.add( new Card( rank, suit ));
            }
        }
        Collections.shuffle(aCards);
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
        aCards.add(pCard);
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
        return aCards.remove(aCards.size() - 1);
    }

    /**
     * @return True if and only if there are no cards in the deck.
     */
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    /**
     * @return An unmodifiable list of all the cards in the deck.
     */
    public List<Card> getCards()
    {
        return Collections.unmodifiableList(aCards);
    }

    /**
     * Sorts the cards in the deck by ascending rank.
     */
    public void sort()
    {
        Collections.sort(aCards, new Comparator<Card>()
        {
            public int compare(Card pCard1, Card pCard2)
            {
                return pCard1.getRank().compareTo(pCard2.getRank());
            }
        });
    }

    @Override
    public Iterator<Card> iterator()
    {
        return aCards.iterator();
    }
}
