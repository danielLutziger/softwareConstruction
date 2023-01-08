package lecture9.book.visitorPattern;

import lecture9.book.CardSequence;
import lecture9.book.CompositeCardSource;
import lecture9.book.Deck;

// representation of the hierarchical structure
public class StructurePrinterVisitor extends AbstractCardSourceVisitor
{
    private int aTab = 0;

    private String tab()
    {
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < aTab; i++ )
        {
            result.append(" ");
        }
        return result.toString();
    }

    @Override
    public void visitCompositeCardSource(CompositeCardSource pCompositeCardSource)
    {
        System.out.println(tab() + "Composite");
        aTab++;
        super.visitCompositeCardSource(pCompositeCardSource);
        aTab--;
    }

    @Override
    public void visitDeck(Deck pDeck)
    {
        System.out.println(tab() + "Deck");
    }

    @Override
    public void visitCardSequence(CardSequence pCardSequence)
    {
        System.out.println(tab() + "CardSequence");
    }
}