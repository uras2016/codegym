import org.junit.Test;

import static org.junit.Assert.*;

public class KmpSubMoveTest {

    @Test
    public void testSubMoveQuantity() throws Exception {

        KmpSubMove kmpSubMove = new KmpSubMove();

        String a = "abcd";
        String b = "cdab";


        int expected = 2;

        assertEquals(2,kmpSubMove.subMoveQuantity(a, b));

    }
}