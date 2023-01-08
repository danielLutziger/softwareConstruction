package lecture8.book.templatePattern;

import lecture8.book.GameModel;

// concrete implementation of template design pattern
public final class CardMove extends AbstractMove
{
    /**
     * In practice this would also need to accept the source
     * and destination piles.
     *
     * @param pModel The game model on which the move is performed.
     */
    public CardMove(GameModel pModel)
    {
        super(pModel);
    }

    @Override
    public void undo()
    {
        /* Undo the move */
    }

    @Override
    protected void execute()
    {
        /* Execute the move */
    }
}
