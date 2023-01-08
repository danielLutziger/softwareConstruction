package lecture9.book.visitorPattern;

import lecture9.book.CardSequence;
import lecture9.book.CompositeCardSource;
import lecture9.book.Deck;

// ability to visit all types of card sources
// in a composite structure
public interface CardSourceVisitor
{
    void visitCompositeCardSource(CompositeCardSource pCompositeCardSource);

    void visitDeck(Deck pDeck);

    void visitCardSequence(CardSequence pCardSequence);
}
