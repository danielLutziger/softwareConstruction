package examBoilerPlate;

import examBoilerPlate.inheritanceExample.Porsche;
import examBoilerPlate.removedSwitch.MagePlayer;
import examBoilerPlate.removedSwitch.Player;
import examBoilerPlate.removedSwitch.WarriorPlayer;
import examBoilerPlate.specialBoolean.MyBoolean;
import examBoilerPlate.specialBoolean.MyFalse;
import examBoilerPlate.specialBoolean.MyTrue;
import examBoilerPlate.specialBoolean.MyUnknown;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Main {
    private static final int LASTDIGIT = 9;
    public static void main(String args[]){
        Porsche p = new Porsche(new ArrayList<>(Arrays.asList(4, 3, 2, 1)), "hello", 69);
        p.add(65);
        p.setA("goodbye");
        p.setB(96);

        MyBoolean b1 = new MyTrue();
        MyBoolean b2 = new MyFalse();
        MyBoolean b3 = new MyUnknown();

        b3.and(b1);
        b3.and(b2);
        b3.and(b3);

        printPositionAsDouble(new Point(34, 53));
        //printPositionAsDouble(new Point(null, null));

        Player p1 = new WarriorPlayer(5);
        Player p2 = new MagePlayer(1);

        System.out.println(randomEncounter(p1, p2));
    }

    public static String randomEncounter(Player you, Player enemy){
        while(enemy.getHealth() > 0){
            you.doAttack(enemy);
            enemy.doAttack(you);
            if (you.getHealth() <= 0) return "Battle lost...";
        }
        return "Battle won!";
    }

    public static void printPositionAsDouble(Point p){
        double x = p.getX().doubleValue();
        double y = p.getY().doubleValue();
        System.out.println(x + " " + y);
    }

    public static boolean containsLastDigit(List<Integer> aList){
        for (Integer value : aList){
            if(value == LASTDIGIT){
                return true;
            }
            System.out.println(value);
        }
        return false;
    }

    @Test
    public void testEmptyList(){
        assertFalse(containsLastDigit(new ArrayList<>()));
    }

    @Test
    public void testLastDigitInList(){
        assertTrue(containsLastDigit(new ArrayList<>(Arrays.asList(1,8,6,4,2,6,4,9))));
    }

    @Test
    public void testLastDigitNotInList(){
        assertFalse(containsLastDigit(new ArrayList<>(Arrays.asList(1,8,6,4,2,6,4,8))));
    }

}
