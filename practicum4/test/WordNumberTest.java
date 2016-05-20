import static org.junit.Assert.*;

public class WordNumberTest {

    @org.junit.Test
    public void testCount() throws Exception {

        WordNumber wordNumber = new WordNumber();

        String input = "I believe in true";

        int expected = 4;

        assertEquals("wrong code!", expected,wordNumber.count(input));

    }
}