package lecture6.testing.strategyPatternAndSingleton;

public class GameModel implements GameViewModel
{
    private static GameModel INSTANCE = new GameModel();

    private PlayingStrategy aPlayingStrategy;

    public static GameModel instance()
    {
        return INSTANCE;
    }

    public void tryToAutoPlay()
    {
        aPlayingStrategy.computeNextMove(this);
    }
}