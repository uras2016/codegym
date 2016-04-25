public class FindMaxNumber {
    public int max(int[] input) {

        int max=input[0];

        for (int i : input) {

            if (max < i)
                max = i;


        }
        return max;
    }
}