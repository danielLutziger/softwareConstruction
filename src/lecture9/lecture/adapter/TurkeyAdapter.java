package lecture9.lecture.adapter;

// adapter pattern
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){ // receive the object you want to adapt
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
