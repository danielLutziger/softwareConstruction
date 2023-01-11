package examBoilerPlate.removedSwitch;

public class MagePlayer extends Player {
    public MagePlayer(int health) {
        super(health);
    }

    @Override
    public void doAttack(Player enemy) {
        // code of castFireBall
        enemy.gotAttacked(3);
        System.out.println("Cast Fire Ball");
    }
}
