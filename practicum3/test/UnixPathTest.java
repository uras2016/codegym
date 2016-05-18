import static org.junit.Assert.*;

public class UnixPathTest {

    @org.junit.Test
    public void testSimplify() throws Exception {
UnixPath unixPath = new UnixPath();
    String input = "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";

        String actual = unixPath.simplify(input);

        assertEquals(expected,actual);
    }
}