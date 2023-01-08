package lecture10.command;

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
