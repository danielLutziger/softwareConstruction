package lecture9;

import lecture5.flyweight.Card;
import lecture9.visitorPattern.CardSourceVisitor;

// visitable card source
public interface CardSource
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

    /**
     * Accepts a visitor for traversal into this structure.
     *
     * @param pVisitor The visitor to accept
     */
    void accept(CardSourceVisitor pVisitor);
}
