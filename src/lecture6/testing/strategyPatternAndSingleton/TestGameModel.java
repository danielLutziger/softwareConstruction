package lecture6.testing.strategyPatternAndSingleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestGameModel
{
    static class StubStrategy implements PlayingStrategy
    {
        private boolean aExecuted = false;

        public boolean hasExecuted()
        {
            return aExecuted;
        }

        public Move computeNextMove(GameViewModel pModelView)
        {
            aExecuted = true;
            return new NullMove();
        }
    }

    @Test
    public void testTryToAutoPlay()
    {
        try
        {
            Field strategyField = GameModel.class.getDeclaredField("aPlayingStrategy");
            strategyField.setAccessible(true);
            StubStrategy strategy = new StubStrategy();
            GameModel model = GameModel.instance();
            strategyField.set(model, strategy);
            model.tryToAutoPlay();
            assertTrue(strategy.hasExecuted());
        }
        catch( ReflectiveOperationException e )
        {
            fail();
        }
    }
}