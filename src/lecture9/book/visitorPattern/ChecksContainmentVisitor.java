package lecture9.book.visitorPattern;

import lecture5.flyweight.Card;
import lecture9.book.CardSequence;
import lecture9.book.CompositeCardSource;
import lecture9.book.Deck;

// concrete visitor: checks wheter aa card is contained in a card source structure
public class ChecksContainmentVisitor extends AbstractCardSourceVisitor
{
    private final Card aCard;
    private boolean aResult = false;

    public ChecksContainmentVisitor(Card pCard)
    {
        aCard = pCard;
    }

    public void reset()
    {
        aResult = false;
    }

    @Override
    public void visitDeck(Deck pDeck)
    {
        for( Card card : pDeck)
        {
            if( card.equals(aCard))
            {
                aResult = true;
                break;
            }
        }
    }

    @Override
    public void visitCardSequence(CardSequence pCardSequence)
    {
        for( int i = 0; i < pCardSequence.size(); i++ )
        {
            if( pCardSequence.get(i).equals(aCard))
            {
                aResult = true;
                break;
            }
        }
    }

    @Override
    public void visitCompositeCardSource(CompositeCardSource pCompositeCardSource)
    {
        if( !aResult)
        {
            super.visitCompositeCardSource(pCompositeCardSource);
        }
    }

    public boolean contains()
    {
        return aResult;
    }
}