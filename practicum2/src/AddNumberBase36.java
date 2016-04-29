//Додавання за основою 36
//
//        Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
//        Повернути суму чисел, також в системі 36.
//        Наприклад:
//        "9" + "1" = "a"
//        "z" + "1" = "10"

public class AddNumberBase36 {

    public String add(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int c=0;

        int i = a.length() - 1;
        int j = b.length() - 1;
        String out="";

        while (i>=0||j>=0||c>0){
            byte ares= i>=0 ? Byte.parseByte(String.valueOf(a.charAt(i)),36):0;
            byte bres= j>=0 ? Byte.parseByte(String.valueOf(b.charAt(j)),36):0;
            out = Integer.toString((ares+bres+c)%36,36)+out;
            c=(ares+bres+c)/36;

            i--;
            j--;

        }
        return out;
    }
}
