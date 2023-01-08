package lecture9.lecture.decorator;

public class Whip  extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage b){
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Whip";
    }
}
