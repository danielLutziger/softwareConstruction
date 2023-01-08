package lecture10.strategy;

import lecture5.flyweight.Card;

import java.util.List;
import java.util.function.Function;

public class AutoPlayer
{
    private Function<List<Card>, Card> aSelectionStrategy;

    public AutoPlayer(Function<List<Card>, Card> pSelectionStrategy)
    {
        aSelectionStrategy = pSelectionStrategy;
    }

    @SuppressWarnings("unused")
    public void play()
    {
        Card selected = aSelectionStrategy.apply(getCards());
        /* ... */
    }

    // Gets the cards to supply to the strategy
    private List<Card> getCards()
    {
        return null; // this is a stuby
    }
}
