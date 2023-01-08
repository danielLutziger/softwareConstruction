package lecture10.strategy;

public final class StrategyClient
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        AutoPlayer player1 = new AutoPlayer(cards -> cards.get(0));
        AutoPlayer player2 = new AutoPlayer(CardSelection::lowestBlackCard);
    }
}
