package examBoilerPlate.removedSwitch;

public class BardPlayer extends Player {
    public BardPlayer(int health) {
        super(health);
    }

    @Override
    public void doAttack(Player enemy) {
        // code of playSong
        enemy.gotAttacked(1);
        System.out.println("Play Song");
    }
}
