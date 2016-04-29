import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveAverageNumberTest {
PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();
    @Test
    public void testAverage() throws Exception {
        int a=4;
        int b=5;
        int expected = (a+b)/2;
        try {
            int average = positiveAverageNumber.average(a, b);
            Assert.assertEquals("Wrong method", expected,average);
        }catch (IllegalArgumentException e){
            }
    }
    @Test
    public void testAverageWithNegativeNumbers() throws Exception {
        int a=-4;
        int b=-5;
        int expected = ((a+b)/2)*-1;
        int average = positiveAverageNumber.average(a, b);

        Assert.assertEquals("Wrong method", expected,average);
    }
    @Test
    public void testAverageOnlyNegativeNumbers() throws Exception {
        int a = -4;
        int b = 7;
        int expected = ((a+b)/2)*-1;
        int average = positiveAverageNumber.average(a, b);

    }
    @Test
    public void testAverageEqualNumbers() throws Exception {
        int a=5;
        int b=5;
        int expected = (a+b)/2;
        int average = positiveAverageNumber.average(a, b);

        Assert.assertEquals("Wrong method", expected,average);
    }
}