package by.playtika;

import org.testng.annotations.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.testng.AssertJUnit.*;

public class CalculationsTest {
    @Test
    public void actionTest() {
        Calculations c = new Calculations();

        assertEquals(4d, c.action(2, 2, '+'));
        assertEquals(0d, c.action(2, 2, '-'));
        assertEquals(4d, c.action(2, 2, '*'));
        assertEquals(1d, c.action(2, 2, '/'));
        assertEquals(0d, c.action(-2, 2, '+'));
        assertEquals(0d, c.action(2, -2, '+'));
        assertEquals(-4d, c.action(-2, -2, '+'));
        assertEquals(0d, c.action(0, 2, '/'));
        assertEquals(Infinity, c.action(2, 0, '/'));
        assertEquals(Infinity, c.action(Double.MAX_VALUE, 2, '*'));
        assertEquals(4.44, c.action(2.22, 2.22, '+'));
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void actionTest1() {
        Calculations c1 = new Calculations();
        assertEquals(2.2, c1.action(1.1, 2, 'p'));
    }
}
