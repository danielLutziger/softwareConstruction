package lecture10.book.command;

import lecture5.flyweight.Card;
import lecture7.book.cloneable.Deck;

import java.util.ArrayList;
import java.util.List;

public final class CommandClient
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Command draw = new Command(() -> deck.draw());
        Command shuffle = new Command(() -> deck.shuffle());

        Deck deck2 = new Deck();
        List<Card> drawnCards = new ArrayList<>();
        DeckCommand draw2 = new DeckCommand("draw", ()-> drawnCards.add(deck2.draw()));
    }
}
