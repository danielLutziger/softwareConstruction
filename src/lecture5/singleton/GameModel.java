package lecture5.singleton;

/**
 * singleton code
 */
public class GameModel {
    // no lazy initialization
    private static final GameModel INSTANCE = new GameModel();
    private GameModel() {}

    // CLASS FUNCTION //synchronized: no two threads can access (only one thread at the time)
    // critical section (concurrency)
    // downside: can be a bottleneck
    // if lazy init do synchronized else not
    public synchronized static GameModel instance() { return INSTANCE; }

    public static GameModel getInstance() {
        // possibility to create synchronized blocks
        if (INSTANCE == null){
            synchronized (INSTANCE){
                //INSTANCE = new GameModel();
            }
        }
        return INSTANCE;
    }
}

