package examBoilerPlate.lastdigit;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Main {

    public static void main(String args[]){
    }

    public static boolean checkAreSmallerThanLastDigit(int a, int b){
        boolean aSmaller = false;
        boolean bSmaller = false;

        if (a < LASTDIGIT){
            System.out.println(a + " is smallerè");
            aSmaller = true;
        }
        if (b < LASTDIGIT){
            System.out.println(b + " is smallerè");
            bSmaller = true;
        }
        if (aSmaller && bSmaller) return true;

        return false;
    }

    private static final int LASTDIGIT = 9;

    @Test
    public void testAsmallerTrueBSmallerTrue(){
        assertTrue(checkAreSmallerThanLastDigit(8, 8));
    }
    @Test
    public void testAsmallerFalseBSmallerTrue(){
        assertFalse(checkAreSmallerThanLastDigit(9, 8));
    }
    @Test
    public void testAsmallerTrueBSmallerFalse(){
        assertFalse(checkAreSmallerThanLastDigit(8, 9));
    }
    @Test
    public void testAsmallerFalseBSmallerFalse(){
        assertFalse(checkAreSmallerThanLastDigit(9, 9));
    }
}
