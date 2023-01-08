package lecture9.lecture.decorator;

public class Main {
    public static void main(String args[]){
        Beverage b1 = new Cappuccino();

        System.out.println(b1.cost());

        Beverage b3 = new Milk(new Soy(new Espresso()));
        System.out.println(b3.getDescription());
        System.out.println(b3.cost());
    }
}
