package examBoilerPlate.removedSwitch;

public class WarriorPlayer extends Player {
    public WarriorPlayer(int health) {
        super(health);
    }

    @Override
    public void doAttack(Player enemy) {
        // code of swing sword
        enemy.gotAttacked(5);
        System.out.println("Swing sword");
    }
}
