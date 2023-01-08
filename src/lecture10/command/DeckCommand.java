package lecture10.command;

public class DeckCommand
{
    private final Runnable aCommand;
    private final String aName;

    public DeckCommand(String pName, Runnable pCommand)
    {
        aName = pName;
        aCommand = pCommand;
    }

    public void execute()
    {
        aCommand.run();
    }

    public String getName()
    {
        return aName;
    }
}
