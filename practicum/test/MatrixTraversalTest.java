import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTraversalTest {
    MatrixTraversal matrixTraversal = new MatrixTraversal();

    @Test
    public void testPrint() throws Exception {
        int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        int massive[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] result = matrixTraversal.print(massive);
//        System.out.println(Arrays.toString(result));

        Assert.assertArrayEquals(expected, result);

    }


    @Test
    public void testPrintNullMassive() throws Exception {
        int[] expected = {};
        int massive[][] = {{}};
        int[] result = matrixTraversal.print(massive);
//        System.out.println(Arrays.toString(result));

        Assert.assertArrayEquals(expected, result);

    }
}
