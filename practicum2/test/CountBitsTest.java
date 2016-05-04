import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsTest {
CountBits countBits = new CountBits();
    @Test
    public void testCount() throws Exception {
        int num = 13;
        int expected = 3;
        int result = countBits.count(num);

        assertEquals("wrong code",expected,result);

    }
    @Test
    public void testCount2() throws Exception {
        int num = 142;
        int expected = 4;
        int result = countBits.count(num);

        assertEquals("wrong code",expected,result);

    }
    @Test
    public void testCount3() throws Exception {
        int num = 0;
        int expected = 0;
        int result = countBits.count(num);

        assertEquals("wrong code",expected,result);

    }
}