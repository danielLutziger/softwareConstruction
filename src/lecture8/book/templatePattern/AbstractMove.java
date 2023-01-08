package lecture8.book.templatePattern;


import lecture8.book.GameModel;

/**
 * Root class for all moves that require a reference
 * to the GameModel. Method perform() fulfills the role
 * of the Template Method in an application of the Template
 * Method design pattern.
 */
public abstract class AbstractMove implements Move
{
    protected final GameModel aModel;

    protected AbstractMove(GameModel pModel)
    {
        aModel = pModel;
    }

    public final void perform()
    {
        aModel.push(this);
        execute();
        log();
    }

    protected abstract void execute();

    private void log()
    {
        System.out.println(getClass().getName());
    }
}
