package lecture9.book.visitorPattern;

import lecture9.book.CardSequence;
import lecture9.book.CardSource;
import lecture9.book.CompositeCardSource;
import lecture9.book.Deck;

public class AbstractCardSourceVisitor implements CardSourceVisitor
{
    @Override
    public void visitCompositeCardSource(CompositeCardSource pCompositeCardSource)
    {
        for( CardSource source : pCompositeCardSource )
        {
            source.accept(this);
        }
    }

    @Override
    public void visitDeck(Deck pDeck)
    {}

    @Override
    public void visitCardSequence(CardSequence pCardSequence)
    {}
}