//
//Дается строка в которой делается несколько циклических сдвигов
//        (под циклическим сдвигом понимается перенос последней буквы в начало)
//        Дается также получившаяся строка
//        нужно вернуть минимальное количество сдвигов(int) которым можно получить из 1-й строки итоговую
//        если строку получить циклическим сдвигом нельзя то вывести -1
//
//        Например
//        Дано:
//        abcd
//        cdab
//
//        ответ: 2
public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
        int count = 0;
        if (inputStr == null || resultStr == null) return -1;

        while (!inputStr.equals(resultStr)) {
            if (count > inputStr.length())
                return -1;
            inputStr = inputStr.substring(inputStr.length() - 1) + inputStr.substring(0, inputStr.length() - 1);
            count++;
        }
        return count;
    }
}