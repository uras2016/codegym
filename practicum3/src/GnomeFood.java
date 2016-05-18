/*
В країні гномів прийнято, що більша порція їжі дістається вищому гному.
        Дано два мисиви int[] довжиною N, з висотами гномів в першому і кілограмами їжі в другому.
        Для кожного i-го гнома треба знайти j-ту порцію їжі і записати в результат j-індекси.
        Приклад:
        [5, 7, 6, 9, 4] - гноми
        [8, 5, 6, 2, 3] - порції
        Найвищому гному з висотою 9 дістається найбільша порція 8 з індексом 0.
        Другий за висотою гном (7), отримує другу завбільшки порцію (6) з індексом 2, і т.д.
        Найнищий (4) отримує найменшу порцію 2 (індекс 3)
        Резульнат
        [4, 2, 1, 0, 3]*/
public class GnomeFood {
    public int[] find(int[] gnomes, int[] portions) {

        int[] result = new int[gnomes.length];

        for (int x = 0; x<gnomes.length;x++){
            result[maxIndex(gnomes)] = maxIndex(portions);

        }
        return result;
    }
    private int maxIndex(int[] array){

        int maxIndex = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] > array[maxIndex])   maxIndex = i;

        }


        array[maxIndex] = 0;
        return maxIndex;
    }
}
