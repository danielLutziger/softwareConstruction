package lecture7.lecture.command;

public class GarageCommand implements Command{
    private Garage g;
    public GarageCommand(Garage l){
        this.g = l;
    }

    @Override
    public void execute() {
        g.openDoor();
    }

    @Override
    public void undo() {
        g.closeDoor();
    }
}
