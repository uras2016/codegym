import org.junit.Test;

import static org.junit.Assert.*;

public class UnixPathTest {

    @Test
    public void testSimplify() throws Exception {
        UnixPath unixPath = new UnixPath();
        String fullPath = "/home/../var/./lib//file.txt";
        String expectedShortPath = "/var/lib/file.txt";

        String actual = unixPath.simplify(fullPath);

        assertEquals(expectedShortPath, actual);

    }
}