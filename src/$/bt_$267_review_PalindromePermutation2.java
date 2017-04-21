package $;


import java.util.*;


// tag : learn , review
// todo learn char => int, int => char;
// todo learn s.charAt() , int or char can not be initial as null,

// 30 分钟自己做出来的, 所以不需要code review 下即可
public class bt_$267_review_PalindromePermutation2 {
    public static void main(String[] args) {
        char cur = 98;
        System.out.println(cur + "aa");

        List list;Map map;
        char a = 'a';
        System.out.println((int)a);
        System.out.println((char)97);

        System.out.println(generatePalindromes("aabb"));

        // todo bug case
        System.out.println(generatePalindromes("aaa"));
    }

    public static List<String> generatePalindromes(String s) {
        // step 1
        Set<String> res = new HashSet<>();
        int[] map = new int[256];
        int count = s.length();
        for (char c : s.toCharArray()) map[c]++;

        // step 2 check
        int oddTimes = 0;
        String odd = "";
        for (int i = 0; i < map.length; i++) {
            if (map[i] % 2 != 0) {
                odd += (char) i;
                oddTimes++;
                map[i]--;
            }
        }
        if (oddTimes >= 2) return new ArrayList<String>(res);

        // step 3
        if (count % 2 == 1) count--;
        help(map, count, odd, res);

        return new ArrayList<String>(res);
    }



    public static void help(int[] map, int count, String temp, Set<String> res) {
        if (count == 0) {
            res.add(new String(temp));
            return;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] >= 2) {
                map[i] -= 2;
                char cur = (char) i;
                help(map, count - 2, cur + temp + cur, res);
                map[i] += 2;
            }
        }
    }

}
/** 题
 *
 * http:
 *


 */

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
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
