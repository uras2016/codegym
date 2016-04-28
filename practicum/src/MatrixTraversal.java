//Обійти матрицю по спіралі і записати всі числа в одмірний масив.
//        Для матриці
//        [[1,   2,  3,  4],
//         [5,   6,  7,  8]
//         [9,  10, 11, 12]
//         [13, 14, 15, 16]]
//        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
public class MatrixTraversal {
    public int[] print(int[][] input) {

        if (input == null || input.length == 0||input[0].length==0)
            return new int[0];

        int n = input.length;
        int m = input[0].length;
        int[] massive = new int[n * m];

        int f = n-1;
        int w = m-1;

        int c = 0;
        int i = 0;
        int j = 0;
        int p = 0;

        while (c != n*m-1)
        {
//            if (c >= n*m-1) break;

            while (j < w)
            {
                massive[c++] = input[i][j];
                j++;
            }
            while (i < f)
            {
                massive[c++] = input[i][j];
                i++;
            }
            while (j > p)
            {
                massive[c++] = input[i][j];
                j--;
            }
            f--;
            w--;
            p++;
            while (i > p)
            {
                massive[c++] = input[i][j];
                i--;
            }
        }
//        if(c == n*m-1)
//        {
            massive[c++] = input[i][j];
//        }
        for (int e : massive) {
            System.out.print(e);
        }
        return massive;
    }
}
