import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbcNumberTest {

    @Test
    public void testConvert() throws Exception {
    AbcNumber abcNumber = new AbcNumber();
        int digits =0;
        String  str = "abcdefg";
        int expected = 123456;

        digits = abcNumber.convert(str);

        assertEquals("Not equals", expected,digits);
    }
    @Test
    public void testConvert2() throws Exception {
        AbcNumber abcNumber = new AbcNumber();
        int digits =0;
        String  str = "bcd";
        int expected = 123;

        digits = abcNumber.convert(str);

        assertEquals("Not equals", expected,digits);
    }
    @Test
    public void testConvert3() throws Exception {
        AbcNumber abcNumber = new AbcNumber();
        int digits =0;
        String  str = "d";
        int expected = 3;

        digits = abcNumber.convert(str);

        assertEquals("Not equals", expected,digits);
    }

}