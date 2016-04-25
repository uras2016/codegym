//Сума Цифр
//
//        Обчислити суму цифр числа.
//        Наприклад сума цифр числа 123 дорівнює  6.
public class SumDigits {
    public int sum(int number) {
        int result =0;

       long digit = (number <0) ? (long)number*-1 :number;


        while (digit>0) {
                result = (int) (result + digit % 10);
                digit /= 10;
        }
    return result;
    }
}