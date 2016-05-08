import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.ExactComparisonCriteria;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void testAdd() throws Exception {
AddBinary addBinary = new AddBinary();
        String a="101";
        String b="100";
        String expected="1001";

        String actual = addBinary.add(a,b);

        Assert.assertEquals("wrong", expected, actual);


    }
}