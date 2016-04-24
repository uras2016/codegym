public class FindMaxNumber {
    public int max(int[] input) {
        int summa = 0;
        int max=input[0];

        for (int i : input) {
            summa += i;
            if (max < i)
                max = i;


        }
        return max;
    }
}