package string;

public class string_125_ValidPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(j > i){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!isAlphanumeric(ci)) i++; //todo bug 1
            else if (!isAlphanumeric(cj)) j--;
            else {
                if (ci != cj) {
                    if (ci >= 'a' && cj >= 'A' || ci >= 'A' && cj >= 'a' ) {
                        if (Math.abs(ci - cj) != 'a' - 'A') return false; //todo bug 2
                    } else
                        return false;
                }
                i++;j--;
            }
        }
        return true;
    }

    public boolean isAlphanumeric(char c){
        if ('a' <= c && c <= 'z') return true;
        if ('A' <= c && c <= 'Z') return true;
        if ('0' <= c && c <= '9') return true;
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


 bug3

 'A' - 'a';
 =>
 'a' - 'A'; // todo bug3 这个才是 32
 */




