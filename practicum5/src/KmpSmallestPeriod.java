//A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
//        For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
//        It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
//        Write a program to read a character string and determine its smallest period
//        Return (String) substring;
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {

        StringBuilder sb = new StringBuilder();

        int i=0;

        while (i<input.length()-1){
            sb.append(input.charAt(i));
            if (input.charAt(i+1)==sb.charAt(0)){
                if (input.replaceAll(sb.toString(),"").length()==0)
                    return sb.toString();

            }i++;
        }
        return null;
    }
}
