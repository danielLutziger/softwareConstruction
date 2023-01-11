package examBoilerPlate.specialBoolean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MyBooleanTest {

    MyBoolean b1 = new MyTrue();
    MyBoolean b2 = new MyFalse();
    MyBoolean b3 = new MyUnknown();

    @Test
    public void testMyUnknownAorB(){
        assertEquals(b1, b3.or(b1));
        assertEquals(b3, b3.or(b2));
        assertEquals(b3, b3.or(b3));
    }
    @Test
    public void testMyUnknownAndB(){
        assertEquals(b3, b3.and(b1));
        assertEquals(b2, b3.and(b2));
        assertEquals(b3, b3.and(b3));
    }
    @Test
    public void testMyUnknownNotA(){
        assertEquals(b3, b3.not());
    }

    @Test
    public void testMyTrueAorB(){
        assertEquals(b1, b1.or(b1));
        assertEquals(b1, b1.or(b2));
        assertEquals(b1, b1.or(b3));
    }
    @Test
    public void testMyTrueAndB(){
        assertEquals(b1, b1.and(b1));
        assertEquals(b2, b1.and(b2));
        assertEquals(b3, b1.and(b3));
    }
    @Test
    public void testMyTrueNotA(){
        assertTrue(b1.not() instanceof MyFalse);
    }

    @Test
    public void testMyFalseAorB(){
        assertEquals(b1, b2.or(b1));
        assertEquals(b2, b2.or(b2));
        assertEquals(b3, b2.or(b3));
    }
    @Test
    public void testMyFalseAndB(){
        assertEquals(b2, b2.and(b1));
        assertEquals(b2, b2.and(b2));
        assertEquals(b2, b2.and(b3));
    }
    @Test
    public void testMyFalseNotA(){
        assertTrue(b2.not() instanceof MyTrue);
    }

}
