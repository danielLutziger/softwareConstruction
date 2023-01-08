package lecture10.strategy;

import lecture5.flyweight.Card;

import java.util.List;
import java.util.Optional;

public interface CardSelectionStrategy
{
    /**
     * Select an instance of Card from pCards.
     *
     * @param A
     *            list of cards to choose from.
     * @pre pCards != null && !pCards.isEmpty()
     * @post If RETURN.isPresent(), pCards.contains(RETURN.get())
     */
    Optional<Card> select(List<Card> pCards);

    public static Optional<Card> first(List<Card> pCards)
    {
        return Optional.of(pCards.get(0));
    }

    public static Optional<Card> lowestBlackCard(List<Card> pCards)
    {
        return null; // This is a stub
    }

    public static Optional<Card> highestFaceCard(List<Card> pCards)
    {
        return null; // This is a stub
    }
}
