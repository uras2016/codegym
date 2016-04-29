public class AverageNumber {
    public int average(int a, int b) {

        int result = 0;
        long digitA =  (long)a;
        long digitB = (long)b;


            result = (int) ((digitA + digitB) / 2);

        return result;
    }
}