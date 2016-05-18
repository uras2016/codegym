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

        //Коллекция, ось абсцис. В каждом элементе коллекции записана
        //максимальная высота из всех прямоугольников, попадающих в эту координату
        List<Integer> commonArea = new ArrayList<>();

        //Перебор всех параметорв
        for (int i = 0; i < x.length; i++) {

            //Если очередной прямоугольник выходит за пределы
            //коллекции (оси абсцис), то увеличить коллекцию
            increaseCommonArea(commonArea, x[i] + w[i]);

            //Запись в каждый элемент коллекции (т.е. в каждую координату оси)
            //высоты очередного прямоугольника, но только если она больше
            //чем уже записанная там.
            for (int j = 0; j < w[i]; j++) {
                if (commonArea.get(x[i] + j) < h[i]) {
                    commonArea.set(x[i] + j, h[i]);
                }
            }
        }

        return sumList(commonArea);
    }

    /**
     * Увиличение размера коллекции
     * @param area коллекция
     * @param newSize новый размер коллекции
     */
    private void increaseCommonArea(List<Integer> area, int newSize) {
        if (area.size() < newSize) {
            for (int i = area.size(); i < newSize; i++) {
                area.add(0);
            }
        }
    }

    /**
     * Сумма элементов коллекции
     * @param list коллекция
     * @return сумма элементов
     */
    private int sumList(List<Integer> list) {
        int result = 0;
        for (int value : list) {
            result += value;
        }
        return result;
    }
}