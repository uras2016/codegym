import org.junit.Test;

import static org.junit.Assert.*;

public class SetZeroTest {
SetZero setZero = new SetZero();
    @Test
    public void testSet() throws Exception {

        int num=6;
        int i = 2;
        int expected = 4;
        int result = setZero.set(num,i);

        assertEquals("wrong method", expected, result);
    }
    @Test
    public void testSet2() throws Exception {

        int num=110;
        int i = 6;
        int expected = 78;
        int result = setZero.set(num,i);

        assertEquals("wrong method", expected, result);
    }
}