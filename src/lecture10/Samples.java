package lecture10;

import lecture5.Rank;
import lecture5.Suit;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * command: command pattern examples with functional programming
 * strtegy; strategy pattern exampels with functional programming
 *
 * deck: implemented further methods for funcitonal programming including streams
 * card stack: implemented stream methods
 *
 * card: implemented several methods to check (especially lambda expressions, stacked streams, and few method references)
 * samples3: methods inculding method refre3nces, streams, lambda exampeles
 */
public class Samples
{
    public static void main(String[] args)
    {
        samples1(); // Section 9.1
        samples2(); // Section 9.2
        samples3(); // Section 9.6
    }

    /**
     * For Section 9.1
     */
    private static void samples1()
    {
        List<Card> cards = new Deck().getCards();

        // Calling 'sort' with an object of an anonymous class
        Collections.sort(cards, new Comparator<Card>()
        {
            public int compare(Card pCard1, Card pCard2)
            {
                return pCard1.getRank().compareTo(pCard2.getRank());
            }
        });
        printAll(cards);

        // Calling 'sort' with a method reference
        Collections.sort(cards, Card::compareByRank);
        printAll(cards);
    }

    /**
     * For Section 9.2
     */
    @SuppressWarnings("unused")
    private static void samples2()
    {
        // Defining a function object of type Filter, which is an application-defined functional interface
        Filter blackCards1 = new Filter()
        {
            @Override
            public boolean accept(Card pCard)
            {
                return pCard.getSuit().getColor() == Suit.Color.BLACK;
            }
        };

        // Defining a function object whose type is a library functional interface
        Predicate<Card> blackCards2 = new Predicate<Card>()
        {
            public boolean test(Card pCard)
            {
                return pCard.getSuit().getColor() == Suit.Color.BLACK;
            }
        };

        // Defining a predicate using a lambda expression (expression syntax with parameter type specified)
        Predicate<Card> blackCards3 = (Card card) -> card.getSuit().getColor() == Suit.Color.BLACK;

        // Defining a predicate using a lambda expression (block syntax with parameter type specified)
        Predicate<Card> blackCards4 =
                (Card card) -> { return card.getSuit().getColor() == Suit.Color.BLACK; };

        // Defining a predicate using a lambda expression (expression syntax with parameter type not specified)
        Predicate<Card> blackCards5 = (card) -> card.getSuit().getColor() == Suit.Color.BLACK;

        // Defining a predicate using a lambda expression (expression syntax with parameter type not specified
        // and no parentheses around the parameter
        Predicate<Card> blackCards6 = card -> card.getSuit().getColor() == Suit.Color.BLACK;

        // Sample use of the filter:
        int total = 0;
        for( Card card : new Deck().getCards() )
        {
            if( blackCards6.test(card) )
            {
                total++;
            }
        }
        System.out.println(total);

        // Example use of removeIf
        ArrayList<Card> cards = new ArrayList<>(new Deck().getCards());
        cards.removeIf(card -> card.getSuit().getColor() == Suit.Color.BLACK );
        printAll(cards);

        // Example of using a method reference with removeIf
        cards = new ArrayList<>(new Deck().getCards());
        cards.removeIf(Card::hasBlackSuit);
        printAll(cards);
    }

    /**
     * For Section 9.6
     */
    @SuppressWarnings("unused")
    public static void samples3()
    {
        Stream<Card> cards = new Deck().stream();
        long total = cards.count();
        System.out.println(total);

        Stream<Card> sortedCards = new Deck().stream().sorted();
        sortedCards.forEach(System.out::println);

        Stream<Card> sortedCards2 = new Deck().stream().sorted().limit(10);
        sortedCards2.forEach(System.out::println);

        Stream<Card> cards2 = Stream.concat(new Deck().stream(), new Deck().stream());
        System.out.println(cards2.count());

        Stream<Card> withDuplicates = Stream.concat(new Deck().stream(), new Deck().stream());
        Stream<Card> withoutDuplicates = withDuplicates.distinct();

        new Deck().stream().forEach(card -> System.out.println(card));

        boolean allClubs = new Deck().stream()
                .allMatch(card -> card.getSuit() == Suit.CLUBS );

        long numberOfFaceCards = new Deck().stream()
                .filter(card -> card.getRank().ordinal() >= Rank.JACK.ordinal()).count();

        long numberOfFaceCards2 = new Deck().stream()
                .filter(Card::isFaceCard)
                .count();

        long result = new Deck().stream()
                .filter(card -> card.getRank().ordinal() >= Rank.JACK.ordinal()
                        && card.getSuit()==Suit.CLUBS).count();

        long result2 = new Deck().stream()
                .filter(Card::isFaceCard)
                .filter(card -> card.getSuit() == Suit.CLUBS)
                .count();

        new Deck().stream().map(card -> card.getSuit().getColor() );

        long result3 = new Deck().stream()
                .map(card -> card.getSuit().getColor() )
                .filter( color -> color == Suit.Color.BLACK )
                .count();

        new Deck().stream()
                .map(card -> Math.min(10, card.getRank().ordinal() + 1));

        int total2 = new Deck().stream()
                .mapToInt(card -> Math.min(10, card.getRank().ordinal() + 1))
                .sum();

        int total3 = new Deck().stream()
                .map(Card::getRank)
                .mapToInt(Rank::ordinal)
                .map(ordinal -> Math.min(10, ordinal + 1))
                .sum();

        // Not ideal
        List<Card> result4 = new ArrayList<>();
        new Deck().stream()
                .filter(Card::isFaceCard)
                .forEach(card -> result4.add(card));

        // Better
        List<Card> result5 = new Deck().stream()
                .filter(Card::isFaceCard)
                .collect(Collectors.toList());
    }

    private static void printAll(List<Card> pCards)
    {
        for( Card card : pCards)
        {
            System.out.println(card);
        }
    }
}
