package lecture7.Decorator;

import lecture5.flyweight.Card;
import lecture7.CardStack;
import lecture7.cloneable.CardSource;

// not decorator!
public class LoggingDeck implements CardSource
{
    private CardStack aCards = new CardStack();

    @Override
    public Card draw()
    {
        Card card = aCards.pop();
        System.out.println(card);
        return card;
    }

    @Override
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    @Override
    public LoggingDeck clone()
    {
        try
        {
            LoggingDeck clone = (LoggingDeck) super.clone();
            clone.aCards = new CardStack(clone.aCards);
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            assert false;
            return null;
        }
    }
}