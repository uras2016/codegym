//Дано число. Треба замінити i-й біт замінити на нуль.
//        Наприклад:
//        для числа 6 в бінарному вигляді 110,
//        замінивши 2-й біт на нуль отримаємо 100 тобто 4.
//        1<= i <= 32
public class SetZero {
    public int set(int num, int i) {
        int newNum;

       StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));

            if (i>0 && i<=sb.length()) {
                sb.replace(sb.length() - i, sb.length() - i+1, "0");
            }
        newNum = (int) Long.parseLong(sb.toString(),2);

        return newNum;
    }

}