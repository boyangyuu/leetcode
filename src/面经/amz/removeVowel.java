package 面经.amz;

/**
 * Created by yuboyang on 2/21/17.
 */
public class removeVowel {
    public static void main(String[] args) {
        System.out.println(removeVowel("aeiousss"));
    }

    public static String removeVowel(String string) {
        String res = "";
        String vowels = "aeiouAEIOU";
        for (char c : string.toCharArray()) {
            if (vowels.indexOf(c) == -1) res = res + c;
        }
        return res;
    }
}
