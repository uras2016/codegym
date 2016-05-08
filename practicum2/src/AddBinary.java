//Додайте два беззнакових числа, що передаються як рядки.
//        "101" + "100" = "1001"

import java.util.ArrayList;


class AddBinary {
    String add(String a, String b) {
        ArrayList<Integer> aArray = new ArrayList<Integer>();
        ArrayList<Integer> bArray = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);

        for (int i = a.length() - 1; i >= 0; i--) {
            aArray.add(a.charAt(i) - '0');
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            bArray.add(b.charAt(i) - '0');
        }
        for (int i = 0; i < Math.max(aArray.size(), bArray.size()); i++) {

            if (aArray.size() - 1 < i) {
                aArray.add(0);
            }
            if (bArray.size() - 1 < i) {
                aArray.add(0);
            }

            result.add((aArray.get(i) + bArray.get(i) + result.get(i)) / 2);
            result.set(i, (aArray.get(i) ^ bArray.get(i) ^ result.get(i)));
        }
        if (result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        StringBuilder stringResult = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            stringResult.append(result.get(i));
        }

        return stringResult.toString();
    }
}