import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFindMaxNumber {
FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMax() throws Exception {
        int expected = 300;
        int[] intArray = {30, 8, 100, -3, 2, 300, 224};
        int result = findMaxNumber.max(intArray);

        Assert.assertEquals(expected, result);

    }
    @Test
    public void testMaxWithNull() throws Exception {
        int expected = 0;
        int[] intArray = {-30, -8, 0, -3, -2, -300, -224};
        int result = findMaxNumber.max(intArray);

        Assert.assertEquals(expected, result);

    }
}