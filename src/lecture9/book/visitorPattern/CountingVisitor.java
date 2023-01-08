package lecture9.book.visitorPattern;

import lecture5.flyweight.Card;
import lecture9.book.CardSequence;
import lecture9.book.Deck;

// concerete visitor implementation
public class CountingVisitor extends AbstractCardSourceVisitor
{
    private int aCount = 0;

    @Override
    public void visitDeck(Deck pDeck)
    {
        for( @SuppressWarnings("unused") Card card : pDeck)
        {
            aCount++;
        }
    }

    @Override
    public void visitCardSequence(CardSequence pCardSequence)
    {
        aCount += pCardSequence.size();
    }

    public int getCount()
    {
        return aCount;
    }

    public void reset()
    {
        aCount = 0;
    }
}