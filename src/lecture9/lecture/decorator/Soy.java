package lecture9.lecture.decorator;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage b){
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Soy";
    }
}
