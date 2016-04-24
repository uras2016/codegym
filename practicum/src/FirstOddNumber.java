//Знайти перше непарне число і повернути його індекс.
//        Якщо такого немає, повернути -1

public class FirstOddNumber {
    public int find(int[] input) {
        int index=-1;

        for (int i = 0; i < input.length; i++) {

            if (input[i] % 2 == 0) continue;

            if (input[i] % 2 != 0){
                index=i;
                System.out.println("Первое нечетное число под индексом:" + index);

                break;

            }

        }return index;
    }
}
