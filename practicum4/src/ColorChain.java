//
//Ланцюжок
//
//        Дано ланки трьох кольорів: білого і 1 м завдовжки, жовтого - 2 м і червоного - 3 м.
//        Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
//        Кількість наявних ланок кожного кольору вважати бескінечною.

public class ColorChain {
    public int count(int N) {
        int length = N;
        int count = 0;
        if (length == 0 || length == 1 || length == 2)
            return length;
        if (length == 3)
            return 4;

        count = count(length - 1) + count(length - 2) + count(length - 3);

        return count;


    }
}
