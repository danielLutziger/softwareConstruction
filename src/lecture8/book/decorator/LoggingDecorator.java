package lecture8.book.decorator;

import lecture5.flyweight.Card;
import lecture8.book.CardSource;

// prints drawn card
public class LoggingDecorator extends AbstractDecorator
{
    public LoggingDecorator(CardSource pElement)
    {
        super(pElement);
    }

    @Override
    public Card draw()
    {
        Card card = super.draw();
        System.out.println(String.format("Draws %s", card));
        return card;
    }
}
