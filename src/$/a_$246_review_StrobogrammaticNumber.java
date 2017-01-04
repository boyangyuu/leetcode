package $;

import java.util.*;

// todo 需要review 符合条件的数字 即可 (review的 都是5分钟要review完的)

public class a_$246_review_StrobogrammaticNumber {
    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("101"));
        System.out.println(isStrobogrammatic("1"));
        System.out.println(isStrobogrammatic("6"));
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("619"));
        System.out.println(isStrobogrammatic("6189"));
    }

    public static boolean isStrobogrammatic(String num) {
        Set<Character> set1 = new HashSet<>();
        set1.add('1');set1.add('0');set1.add('8');

        int i = 0, j = num.length() - 1;
        while (i <= j) {
            if (i == j || num.charAt(i) == num.charAt(j)) {
                if (!set1.contains(num.charAt(i))) return false;
            } else {
                boolean res = false;
                res = res || num.charAt(i) == '6' && num.charAt(j) == '9';
                res = res || num.charAt(i) == '9' && num.charAt(j) == '6';
                if (res == false) return false;
            }
            i++;j--;
        }
        return true;
    }

}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######


 TODO case

 TODO bug

 bug2
 bug3
 */




