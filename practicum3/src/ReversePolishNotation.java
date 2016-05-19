import java.util.ArrayDeque;
import java.util.Deque;

//Дано арифметичний вираз у вигляді Польського Інверсного запису.
//        Необхідно обчислити значення виразу і повернути його.
//
//        Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.

public class ReversePolishNotation {
    public int evaluate(String expression) {



        String[] exp = expression.split(" ");

        ArrayDeque<String> deque = new ArrayDeque<>();
        int result = 0;

        for (String s : exp) {

            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                deque.addFirst(s);
                continue;
            } else {
                int firstNumber = Integer.parseInt(deque.removeFirst());
                int secondNumber = Integer.parseInt(deque.removeFirst());
                switch (s) {
                    case "+":
                        result = secondNumber + firstNumber;
                        break;
                    case "-":
                        result=secondNumber-firstNumber;
                        break;
                    case"*":
                        result = secondNumber*firstNumber;
                        break;
                    case "/":
                        result = secondNumber/firstNumber;
                        break;
                }

                deque.addFirst(String.valueOf(result));
            }
        }

        return Integer.parseInt(deque.removeFirst());
    }

}