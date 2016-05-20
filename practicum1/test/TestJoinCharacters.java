import org.junit.Assert;
import org.junit.Test;


public class TestJoinCharacters {
    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testJoinSingleElementArray() throws Exception {
        char[] input = {'1'};
        int expected = 1;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly",
                expected, actualResult);
    }

    @Test
    public void testJoinThreeElementArray() throws Exception {
        char[] input = {'1','2','4'};
        int expected = 124;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly for three elements",
                expected, actualResult);
    }

    @Test
    public void testJoin0ElementArray() throws Exception {
        char[] input = {'0'};
        int expected = 0;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly for three elements",
                expected, actualResult);
    }
}
