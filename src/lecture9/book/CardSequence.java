package lecture9.book;

import lecture5.flyweight.Card;
import lecture9.book.visitorPattern.CardSourceVisitor;

import java.util.Arrays;
import java.util.List;

public class CardSequence implements CardSource
{
    private final List<Card> aCards;

    public CardSequence(Card... pCards)
    {
        aCards = Arrays.asList(pCards);
    }

    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    public Card get(int pPosition)
    {
        return aCards.get(pPosition);
    }

    public Card draw()
    {
        return aCards.remove(size() - 1);
    }

    public int size()
    {
        return aCards.size();
    }

    @Override
    public void accept(CardSourceVisitor pVisitor)
    {
        pVisitor.visitCardSequence(this);
    }
}