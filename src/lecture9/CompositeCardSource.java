package lecture9;

import lecture5.flyweight.Card;
import lecture9.visitorPattern.CardSourceVisitor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// card source composed of other card sources
public class CompositeCardSource implements CardSource, Iterable<CardSource>
{
    private final List<CardSource> aElements;

    @Override
    public Iterator<CardSource> iterator()
    {
        return aElements.iterator();
    }

    public CompositeCardSource(CardSource... pSources)
    {
        aElements = Arrays.asList(pSources);
    }

    @Override
    public Card draw()
    {
        assert !isEmpty();
        for( CardSource source : aElements )
        {
            if( !source.isEmpty() )
            {
                return source.draw();
            }
        }
        assert false;
        return null;
    }

    @Override
    public boolean isEmpty()
    {
        for( CardSource source : aElements )
        {
            if( !source.isEmpty() )
            { return false; }
        }
        return true;
    }

    @Override
    public void accept(CardSourceVisitor pVisitor)
    {
        pVisitor.visitCompositeCardSource(this);
    }
}
