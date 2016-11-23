package string;

// todo 记住 如何将小写转大写即可
// todo 记住 数字的case "1oooo1" 这种也叫回文
public class string_125_bug1_ValidPalindrome {
    public static void main(String[] args) {
        //case number
        System.out.println(isPalindrome("11"));

        //case upper
        System.out.println(isPalindrome("Aa"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toUpperCase(); // todo bug 1 记住这种方式
        int i = 0, j = s.length() - 1;
        while(j > i){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!isAlphanumeric(ci)) i++; //solved bug 1
            else if (!isAlphanumeric(cj)) j--;
            else {
                if (ci != cj) return false;
                i++;j--;
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(char c){
        if ('a' <= c && c <= 'z') return true;
        if ('A' <= c && c <= 'Z') return true;
        if ('0' <= c && c <= '9') return true;  //todo bug 3 case 数字
        return false;
    }

}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation
 alphanumeric 字母数字的 包括字母和数字!!

 TODO solotion


 TODO case

 TODO bug

 bug1
    if ()
        if ()
    else
 这样写是不对的,


 bug2
 if (ci != cj && Math.abs(ci - cj) != 32) return false; //todo bug 2 数字可能与字母 产生32差距
 =>
 if (ci >= 'a' && cj >= 'A' || ci >= 'A' && cj >= 'a') //todo bug 2 数字可能与字母 产生32差距
 return Math.abs(ci - cj) == 'A' - 'a';

 case "0P"
 output : true
 expected: false


 */




