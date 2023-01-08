package lecture7.book.Decorator;

import lecture5.flyweight.Card;
import lecture7.book.cloneable.CardSource;

import java.util.ArrayList;
import java.util.List;

// CardSource decorator
public class MemorizingDecorator implements CardSource
{
    private CardSource aElement;
    private List<Card> aDrawnCards = new ArrayList<>();

    public MemorizingDecorator(CardSource pCardSource)
    {
        aElement = pCardSource;
    }

    @Override
    public boolean isEmpty()
    {
        return aElement.isEmpty();
    }

    @Override
    public Card draw()
    {
        // 1. Delegate the original request to the decorated object
        Card card = aElement.draw();
        // 2. Implement the decoration
        aDrawnCards.add(card);
        return card;
    }

    @Override
    public MemorizingDecorator clone()
    {
        try
        {
            MemorizingDecorator clone = (MemorizingDecorator) super.clone();
            clone.aElement = aElement.clone();
            clone.aDrawnCards = new ArrayList<>(aDrawnCards);
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            assert false;
            return null;
        }
    }
}