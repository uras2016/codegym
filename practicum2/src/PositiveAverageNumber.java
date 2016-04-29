//Додатнє Середнє Арифметичне
//
//        Знайти середнє арифметике двух додатніх чисел.
//        Наприклад:
//        average( 2, 4 ) = 3
//        average( 4, 7 ) = 5

public class PositiveAverageNumber {
    public int average(int a, int b) {
        if (a<0||b<0){
            throw new IllegalArgumentException(
                    "Only positive numbers are allowed");

        }
        int result = 0;
        long digitA =  (long)a;
        long digitB = (long)b;


        result = (int) ((digitA + digitB) / 2);

        return result;
    }
}
