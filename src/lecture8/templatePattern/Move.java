package lecture8.templatePattern;

public interface Move
{
    /**
     * Performs the move.
     */
    void perform();

    /**
     * Undoes (reverses) the move.
     */
    void undo();
}