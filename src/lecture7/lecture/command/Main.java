package lecture7.lecture.command;


public class Main {
    public static void main(String args[]){
        // code is not flexible (problem of command pattern)
        Garage g = new Garage();
        GarageRemote gr = new GarageRemote();
        gr.setGarage(g);
        gr.pressButton();

        // again same code
        Light l = new Light();
        LightRemote lr = new LightRemote();
        lr.setLight(l);
        lr.pressButton();

        // code is independent from device => command pattern => loosely coupled
        Garage g2 = new Garage();
        Light l2 = new Light();

        LightCommand lc = new LightCommand(l2);
        GarageCommand gc = new GarageCommand(g2);

        // pass any command
        SimpleRemote s = new SimpleRemote();
        s.setCommand(gc);
        s.pressExecuteButton();
        s.pressUndoButton();

        s.setCommand(lc);
        s.pressExecuteButton();
        s.pressUndoButton();

        Executor e = new Executor();
        e.executeCommand(gc);
        e.executeCommand(lc);
        e.undoLastCommand();
        e.undoLastCommand();


    }
}
