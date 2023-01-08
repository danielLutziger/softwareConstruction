package lecture9.visitorPattern;

import lecture9.CardSequence;
import lecture9.CompositeCardSource;
import lecture9.Deck;

// ability to visit all types of card sources
// in a composite structure
public interface CardSourceVisitor
{
    void visitCompositeCardSource(CompositeCardSource pCompositeCardSource);

    void visitDeck(Deck pDeck);

    void visitCardSequence(CardSequence pCardSequence);
}
