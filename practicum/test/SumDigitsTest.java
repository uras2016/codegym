import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitsTest {
SumDigits sumDigits = new SumDigits();
    @Test
    public void testSum() throws Exception {
        int a = 12;
        int expected = 3;
        int result = sumDigits.sum(a);

        Assert.assertEquals("Wrong result for sum of 532",expected,result );
    }

    @Test
    public void testExample() throws Exception {
        int a = 123;
        int expected = 6;
        int result = sumDigits.sum(a);

        Assert.assertEquals("Wrong result for sum of 123",expected,result );

    }
}