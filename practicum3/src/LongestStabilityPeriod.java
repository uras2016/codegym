//Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
//        Необхідно знайти найдовший період стабільності.
//        Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
//        Повернути кількість місяців.

class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int result = 0;
        if (gdp.length == 0) {
            return 0;
        }
        if (gdp.length == 1) {
            return 1;
        }
        int temporary = 0;
        for (int i = 0; i < gdp.length; i++) {
            int min = gdp[i];
            int max = gdp[i];
            for (int j = i; j < gdp.length; j++) {
                if (gdp[j] > max)
                    max = gdp[j];
                if (gdp[j] < min)
                    min = gdp[j];
                if ((max - min) > 1) {
                    if (temporary > result) result = temporary;
                    temporary = 0;
                    break;
                }
                if ((gdp[i] - gdp[j]) >= -1 && (gdp[i] - gdp[j]) <= 1) {
                    temporary++;
                }
            }
        }
        return result;
    }
}