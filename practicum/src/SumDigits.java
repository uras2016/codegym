//Сума Цифр
//
//        Обчислити суму цифр числа.
//        Наприклад сума цифр числа 123 дорівнює  6.
public class SumDigits {
    public int sum(int number) {
        int result =0;

       if (number <0){
           number*=-1;
       }
        while (number>0) {

                result = result + number % 10;
                number /= 10;


        }
    return result;
    }
}