package lecture7.lecture.command;

public class LightRemote {
    private Light g;
    public LightRemote(){}
    public void setLight(Light c ){
        g = c;
    }
    public void pressButton(){
        g.turnLightOn();
    }
}
