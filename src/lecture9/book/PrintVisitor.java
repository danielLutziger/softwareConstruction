package lecture9.book;

import lecture5.flyweight.Card;
import lecture9.book.visitorPattern.CardSourceVisitor;

/**
 * visitor that prints all cards in the source
 */
public class PrintVisitor implements CardSourceVisitor
{
    public static void main(String[] args)
    {
        PrintVisitor visitor = new PrintVisitor();
        Deck deck = new Deck();
        deck.accept(visitor);
    }

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
    {
        for( Card card : pDeck)
        {
            System.out.println(card);
        }
    }

    @Override
    public void visitCardSequence(CardSequence pCardSequence)
    {
        for( int i = 0; i < pCardSequence.size(); i++ )
        {
            System.out.println(pCardSequence.get(i));
        }
    }
}