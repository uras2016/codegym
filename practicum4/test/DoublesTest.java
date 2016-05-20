import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublesTest {

    @Test
    public void testParse() throws Exception {
        Doubles doubles = new Doubles();
        String a = "-2.e10";
        String b = "+.3";
        String c = ".e2";
        String d = "-1";

        String number = "89.0";

        double expectedNumber = 89.0;

        assertEquals(null, doubles.parse(a));
        assertEquals(null, doubles.parse(b));
        assertEquals(null, doubles.parse(c));
        Assert.assertEquals(expectedNumber, doubles.parse(number), 0);
        Assert.assertEquals(-1.0,doubles.parse(d),0);
    }
}