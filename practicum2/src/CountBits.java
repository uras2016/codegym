//Для даного числа порахувати кількість біт.
//        Наприклад:
//        Для числа 13 в бінарному вигляді 1101 повернути 3.

public class CountBits {
    public int count(int num) {
        int result=0;

        String sb = Integer.toBinaryString(num);
        for (char c: sb.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }


        return result;

    }
}