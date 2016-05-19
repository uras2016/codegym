//Знайти площу яку займають N прямокутників на площині.
//        У всіх прямокутників одна зі сторін лежить на осі абсцис (X).
//        Дано три масива довжиною N.
//        В першому масиві Х координата нижньої-лівої вершини і-го прямокутника ,
//        висота в другому, ширина в третьому. Всі значення невід'ємні.
//        Приклад:
//        X - [0, 0]
//        H - [20, 10]
//        W - [10, 20]
//        Відповідь - 300.

import java.util.ArrayList;
import java.util.List;

public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {


        List<Integer> Area = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {


            increaseCommonArea(Area, x[i] + w[i]);  //увеличиваем Area, если прямоугольник выходит запределы x


            for (int j = 0; j < w[i]; j++) {
                if (Area.get(x[i] + j) < h[i]) {
                    Area.set(x[i] + j, h[i]);
                }
            }
        }

        return sumList(Area);
    }



    private void increaseCommonArea(List<Integer> area, int newSize) {
        if (area.size() < newSize) {
            for (int i = area.size(); i < newSize; i++) {
                area.add(0);
            }
        }
    }


    // Сумма элементов

    private int sumList(List<Integer> list) {
        int result = 0;
        for (int value : list) {
            result += value;
        }
        return result;
    }
}