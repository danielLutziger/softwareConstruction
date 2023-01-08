package lecture7.Composite;

import lecture5.flyweight.Card;
import lecture7.cloneable.CardSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// composite / composition that aggregates  of zero or more card sources
// cloneable
public class CompositeCardSource implements CardSource
{
    private List<CardSource> aElements;

    /**
     * Creates a composite card source comprising all the elements
     * in pCardSources
     *
     * @param pCardSources A sequence of cards sources to aggregate.
     */
    public CompositeCardSource(CardSource... pCardSources)
    {
        aElements = Arrays.asList(pCardSources);
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
    public CardSource clone()
    {
        try
        {
            CompositeCardSource clone = (CompositeCardSource) super.clone();
            clone.aElements = new ArrayList<>();
            for(CardSource source : aElements)
            {
                clone.aElements.add(source.clone());
            }
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}