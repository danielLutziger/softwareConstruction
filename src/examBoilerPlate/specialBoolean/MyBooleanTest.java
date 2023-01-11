package examBoilerPlate.specialBoolean;

import org.junit.Test;

import static org.junit.Assert.*;


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
/*
    private MyBoolean myTrue = new MyTrue();
    private MyBoolean myFalse = new MyFalse();
    private MyBoolean myUnknown = new MyUnknown();
    private boolean isTrue = false;
    private boolean isFalse = false;
    private boolean isUnknown = false;
    @Test
    public void testIfTrue() {
        myTrue.ifTrue(() -> isTrue = true);
        assertTrue(isTrue);
        myFalse.ifTrue(() -> isTrue = true);
        assertFalse(isTrue);
        myUnknown.ifTrue(() -> isTrue = true);
        assertFalse(isTrue);
    }
    @Test
    public void testIfFalse() {
        myTrue.ifFalse(() -> isFalse = true);
        assertFalse(isFalse);
        myFalse.ifFalse(() -> isFalse = true);
        assertTrue(isFalse);
        myUnknown.ifFalse(() -> isFalse = true);
        assertFalse(isFalse);
    }
    @Test
    public void testIfUnknown() {
        myTrue.ifUnknown(() -> isUnknown = true);
        assertFalse(isUnknown);
        myFalse.ifUnknown(() -> isUnknown = true);
        assertFalse(isUnknown);
        myUnknown.ifUnknown(() -> isUnknown = true);
        assertTrue(isUnknown);
    }*/

}
