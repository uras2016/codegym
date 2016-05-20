//Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
//        Наприклад:
//        Для
//        [[ 1, 2, 3 ],
//         [ 4, 5, 6 ],
//         [ 7, 8, 9 ]]
//        повернути
//        [1, 4, 7, 8, 5, 2, 3, 6, 9]

public class MatrixSnakeTraversal1 {
    public int[] print(int[][] input) {
        int[] massive = new int[matrixSize(input)];

        int step = 0;
        boolean even = true;

        for (int i = 0; i < rowLength(input); i++) {
            if (even) {
                for (int k = 0; k < input.length; k++) {
                    massive[step] = input[k][i];
                    step++;


                }
            }else {
                for (int k =input.length-1;k>=0;k--){
                    massive[step]=input[k][i];
                    step++;
                }
            }even=!even;
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