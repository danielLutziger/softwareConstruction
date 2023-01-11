package examBoilerPlate.removedSwitch;

public abstract class Player implements IPlayerStrategy{
    private int health;
    public Player(int health){
        this.health = health;
    }
    protected void gotAttacked(int attackDamage){
        health = health - attackDamage;
    }
    public int getHealth(){return health;}
}
