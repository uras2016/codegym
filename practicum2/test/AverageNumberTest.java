//Середнє Арифметичне
//
//        Знайти середнє значення двох цілих чисел.
//        Приклади:
//        average( 4, 6 ) = 5
//        average( -4, -7 ) = -5
//        average( -4, 7 ) = 1

import org.junit.Assert;

import static org.junit.Assert.*;

public class AverageNumberTest {
AverageNumber averageNumber = new AverageNumber();
    @org.junit.Test
    public void testAverage() throws Exception {
        int a=4;
        int b=5;
        int expected = (a+b)/2;
        int average = averageNumber.average(a, b);

        Assert.assertEquals("Wrong method", expected,average);
    }
    @org.junit.Test
    public void testAverageWithNegativeNumbers() throws Exception {
        int a=-4;
        int b=-5;
        int expected = (a+b)/2;
        int average = averageNumber.average(a, b);

        Assert.assertEquals("Wrong method", expected,average);
    }
    @org.junit.Test
    public void testAverageOnlyNegativeNumbers() throws Exception {
        int a = -4;
        int b = 7;
        int expected = (a + b) / 2;
        int average = averageNumber.average(a, b);

    }
        @org.junit.Test
        public void testAverageEqualNumbers() throws Exception {
            int a=5;
            int b=5;
            int expected = (a+b)/2;
            int average = averageNumber.average(a, b);

            Assert.assertEquals("Wrong method", expected,average);
        }
}