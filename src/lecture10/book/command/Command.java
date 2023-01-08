package lecture10.book.command;

public class Command
{
    private final Runnable aCommand;

    public Command(Runnable pCommand)
    {
        aCommand = pCommand;
    }

    public void execute()
    {
        aCommand.run();
    }
}
