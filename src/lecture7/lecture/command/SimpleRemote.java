package lecture7.lecture.command;

public class SimpleRemote {
    private Command slot;
    public SimpleRemote(){}
    public void setCommand(Command c ){
        slot = c;
    }
    public void pressExecuteButton(){
        System.out.println("EXECUTE PRESSED");
        slot.execute();
    }
    public void pressUndoButton(){
        System.out.println("UNDO PRESSED");
        slot.undo();
    }
}
