import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFirstOddNumber {
FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFirstOddNumber() throws Exception {
        int expected = 1;
        int[] array = {8,5,6,9};
        int result = firstOddNumber.find(array);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFirstOddNumberWithoutOdd() throws Exception {
        int expected=-1;
        int[] array = {8,2,6,10};
        int result = firstOddNumber.find(array);
        Assert.assertEquals(expected,result);
    }
}


