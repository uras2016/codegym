//Обійти матрицю по спіралі і записати всі числа в одмірний масив.
//        Для матриці
//        [[1,   2,  3,  4],
//         [5,   6,  7,  8]
//         [9,  10, 11, 12]
//         [13, 14, 15, 16]]
//        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

public class MatrixTraversal {
    public int[] print(int[][] input) {
        int columnLength = input.length;
        int rowLength = rowLength(input);
        int step = 0;
        int[] massive = new int[matrixSize(input)];

        for (int i=0;i<columnLength/2+1;i++) {
           try{
            for (int right = i; right < rowLength; right++) {
                massive[step] = input[i][right];
                step++;
            }
            for (int down = i + 1; down < columnLength; down++) {
                massive[step] = input[down][rowLength - 1];
                step++;
            }
            for (int left = rowLength - 1 - 1; left >= i; left--) {
                massive[step]=input[columnLength-1][left];
                step++;
            }
            for (int up = columnLength - 1 - 1; up >= i + 1; up--){
                massive[step] = input[up][i];
                step++;
            }
           }catch (ArrayIndexOutOfBoundsException e){

           }
            columnLength--;
            rowLength--;
            }
        return massive;
    }

    public int matrixSize(int[][] inputs){
        int massiveSize = 0;
        for (int[]mass:inputs){
            massiveSize=massiveSize+mass.length;

        }
        return massiveSize;
    }
    public int rowLength(int[][] input){
        int length = 0;
        for (int[]mass:input){
            if (mass.length>length)
                length=mass.length;
        }
        return length;
    }
}
