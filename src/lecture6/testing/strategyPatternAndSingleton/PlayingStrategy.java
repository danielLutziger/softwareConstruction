package lecture6.testing.strategyPatternAndSingleton;

public interface PlayingStrategy
{
    Move computeNextMove(GameViewModel pModel);
}