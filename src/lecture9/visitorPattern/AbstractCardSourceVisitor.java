package lecture9.visitorPattern;

import lecture9.CardSequence;
import lecture9.CardSource;
import lecture9.CompositeCardSource;
import lecture9.Deck;

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