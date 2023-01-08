package lecture8.lecture.inheritance;

public class MemorizingDeck extends Deck {
    private final String subStatement;

    public MemorizingDeck(String statement){
        super("hello");
        subStatement = statement;
    }
}
