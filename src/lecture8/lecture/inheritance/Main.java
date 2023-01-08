package lecture8.lecture.inheritance;

// inheritance
public class Main {

    public static boolean isMemorizing(Deck deck){
        return deck instanceof MemorizingDeck;
    }

    public static boolean isDeck(Deck deck){
        return deck instanceof Deck;
    }

    public static void main(String args[]){
        Deck deck = new MemorizingDeck("test");
        MemorizingDeck md = (MemorizingDeck) deck;
        boolean isMemorizing1 = isMemorizing(deck);
        boolean isMemorizing2 = isMemorizing(md);

        boolean isDeck = isDeck(deck);
        boolean isDeck2 = isDeck(md);
    }
}
