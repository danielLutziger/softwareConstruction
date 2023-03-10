package lecture11.model;

import lecture11.exceptions.AllergyException;
import lecture11.exceptions.NotHungry;

public class Animal {

    private boolean isHungry = false;
    private boolean isAllergic = false;
    private int eaten = 0;

    public Animal() {}

    public Animal(boolean isHungry, boolean isAllergic) {
        this.isHungry = isHungry;
        this.isAllergic = isAllergic;
    }

    // getters
    public boolean isHungry() { return isHungry; }

    public int eat() throws NotHungry, AllergyException {
        int initialEaten = eaten;

        if (!isHungry) {
            System.out.println("Animal not hungry.");
            throw new NotHungry();
        }

        if (isAllergic) {
            System.out.println("Animal allergic.");
            throw new AllergyException();
        }

        System.out.println("Animal is eating!");
        isHungry = false;
        eaten ++;
        assert(!isHungry && eaten > initialEaten);
        return eaten;
    }
}