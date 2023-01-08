package lecture7.cloneable;

import lecture5.flyweight.Card;

// all classes implementing cardsource are cloneable
public interface CardSource extends Cloneable
{
    /**
     * Returns a card from the source.
     *
     * @return The next available card.
     * @pre !isEmpty()
     */
    Card draw();

    /**
     * @return True if there is no card in the source.
     */
    boolean isEmpty();

    CardSource clone();
}
