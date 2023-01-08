package lecture7.lecture.command;

public class LightCommand implements Command{

    private Light l;
    public LightCommand(Light l){
        this.l = l;
    }
    @Override
    public void execute() {
        l.turnLightOn();
    }

    @Override
    public void undo() {
        l.turnLightOff();
    }
}
