package lecture7.lecture.command;

public class GarageRemote {
    private Garage g;
    public GarageRemote(){}
    public void setGarage(Garage c ){
        g = c;
    }
    public void pressButton(){
        g.openDoor();
    }
}
