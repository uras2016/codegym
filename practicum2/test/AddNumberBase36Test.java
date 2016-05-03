import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.portable.Streamable;

import static org.junit.Assert.*;

public class AddNumberBase36Test {
AddNumberBase36 addNumberBase36 = new AddNumberBase36();
    @Test
    public void testAdd() throws Exception {

        String a = "9";
        String b = "1";

        String expected = "a";

        String result = addNumberBase36.add(a,b);

    assertTrue("Wrong result", expected.equals(result));

    }
    @Test
    public void testAdd2() throws Exception {

        String a = "z";
        String b = "1";

        String expected = "10";

        String result = addNumberBase36.add(a,b);

        assertTrue("Wrong result", expected.equals(result));

    }
}