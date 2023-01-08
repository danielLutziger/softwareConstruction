package lecture6.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AbsTest
{
    @Test
    public void testAbs_Positive()
    {
        assertEquals(5, Math.abs(5));
    }

    @Test
    public void testAbs_Negative()
    {
        assertEquals(5, Math.abs(-5));
    }

    @Test
    public void testAbs_Max()
    {
        // This test will fail.
        assertEquals(Integer.MAX_VALUE, Math.abs(Integer.MIN_VALUE));
    }
}
