package lecture9.lecture.decorator;

public class Mocha  extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage b){
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }
}
