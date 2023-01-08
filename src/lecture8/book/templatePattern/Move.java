package lecture8.book.templatePattern;

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