package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_14_ok_longestCommonPrefix {
    public static void main(String[] args) {
        List list;Map map;Set set;
        String[] s = new String[]{"abc", "ab", ""};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            int j = 0;
            while(j < res.length() && j < cur.length()){
                if (res.charAt(j) != cur.charAt(j)) break;
                j++;
            }
            res = res.substring(0, j);
        }
        return res;
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




