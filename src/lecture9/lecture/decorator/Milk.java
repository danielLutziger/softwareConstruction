package lecture9.lecture.decorator;

public class Milk  extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage b){
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }
}