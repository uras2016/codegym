//Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
//        Необхідно повернути початкове число маючи конвертований рядок.
//        Наприклад:
//        Для "bcd" повернути 123

public class AbcNumber {
    public int convert(String num) {
    char[] ch = num.toCharArray();
        int res = 0;
        for (int i=0;i<ch.length;i++)
            res = res*10+(ch[i]-'a');
        return res;
    }
}


/*public class AbcNumber {
    public int convert(String num) {
        int res = 0;
        int step = 0;
        String word = "abcdefghijklmnopqrstuvwxyz";

        for (char c : num.toCharArray()) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    res = res * 10 + i;
                    step++;
                }
            }
        }

        return res;
    }
}*/
/*
public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(convert("bcd"));
    }

    public static int convert(String num) {
        int numLength = num.length();

        StringBuilder resultFromMap = new StringBuilder();

        Map<Character, Integer> symbolCorrespondenceTable = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            symbolCorrespondenceTable.put((char) ('a' + i), i);
        }
        for (int i = 0; i < numLength; i++) {
            char ch = num.charAt(i);
            resultFromMap.append(symbolCorrespondenceTable.get(ch));
        }
        return Integer.parseInt(resultFromMap.toString());
    }
}*/
