package lecture9.lecture.adapter;

public class Main {
    public static void main(String args[]){
        WildTurkey turkey = new WildTurkey();
        Duck adaptedDuck = new TurkeyAdapter(turkey);
        adaptedDuck.fly();
        adaptedDuck.quack();
    }
}
