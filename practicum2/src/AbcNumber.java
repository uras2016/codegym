//Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
//        Необхідно повернути початкове число маючи конвертований рядок.
//        Наприклад:
//        Для "bcd" повернути 123

public class AbcNumber {
    public int convert(String num) {
        int res = 0;
        int step = 0;
        String word = "abcdefghijklmnopqrstuvwxyz";

        for (char c : num.toCharArray()) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    res = res * 10 + i;
                    step++;
                }
            }
        }

        return res;
    }
}