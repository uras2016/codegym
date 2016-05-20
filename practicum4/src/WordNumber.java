//Дано рядок. Порахувати кількість слів.
//        Словом вважається послідовність символів англійського алфавіту [a-zA-Z].
//
//        Алгоритм повинен працювати за O(N) часу, тому RegExp використовувати не можна.

public class WordNumber {
    public int count(String input) {


        int result = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (charIsLetter(input.charAt(i))) {
                word.append(input.charAt(i));
            } else {
                if (word.length() > 0) {
                    result++;
                    word = new StringBuilder();
                }
            }
        }
        if (word.length() > 0) result++;
        return result;
    }

    private boolean charIsLetter(char symbol) {
        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'))
            return true;
        else
            return false;
    }
}
