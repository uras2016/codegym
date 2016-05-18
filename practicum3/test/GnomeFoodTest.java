import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeFoodTest {

    @Test
    public void testFind() throws Exception {

GnomeFood gnomeFood = new GnomeFood();
        int[] gnomes = {5, 7, 6, 9, 4};// - гноми
        int[] portions = {8, 5, 6, 2, 3}; //- порції

        int[] expected = {4, 2, 1, 0, 3};
        int[] actual = gnomeFood.find(gnomes, portions);

        assertArrayEquals(expected, actual);

    }
}