package lecture5;

import lecture5.nullobjectpattern.CardSource;

/**
 * card: flyweight
 * gamemodel: singleton
 * deck: nested class
 * cardsource: null object pattern
 */
public class Client
{
    public static void main(String[] args)
    {
        // Illustration of the use of the Null object
        CardSource source = new Deck();
        System.out.println(source.isNull());
        source = CardSource.NULL;
        System.out.println(source.isNull());

        // Illustration of the use of the Shuffler nested class
        Deck deck = new Deck();
        Deck.Shuffler shuffler = deck.newShuffler();
        shuffler.shuffle();
        shuffler.shuffle();
        deck.shuffle();
        System.out.println(shuffler.getNumberOfShuffles());

        // Illustration of the use of the createByRankComparator static factory method
        // The result should always be zero because both decks are freshly initialized.
        System.out.println(Deck.createByRankComparator(Rank.ACE).compare(new Deck(), new Deck()));

    }
}
