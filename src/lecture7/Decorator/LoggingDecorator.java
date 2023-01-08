package lecture7.Decorator;

import lecture5.flyweight.Card;
import lecture7.cloneable.CardSource;

// CardSource decorator
public class LoggingDecorator implements CardSource
{
    private CardSource aSource;

    public LoggingDecorator( CardSource pSource )
    {
        aSource = pSource;
    }

    @Override
    public Card draw()
    {
        Card card = aSource.draw();
        System.out.println(card);
        return card;
    }

    @Override
    public boolean isEmpty()
    {
        return aSource.isEmpty();
    }

    @Override
    public LoggingDecorator clone()
    {
        try
        {
            LoggingDecorator clone = (LoggingDecorator) super.clone();
            clone.aSource = aSource.clone();
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            assert false;
            return null;
        }
    }

}