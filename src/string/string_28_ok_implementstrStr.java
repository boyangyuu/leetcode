package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 是否可以优化??

public class string_28_ok_implementstrStr {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int strStr(String hayStack, String needle) {
        int res = -1;
        for (int i = 0; i < hayStack.length() - needle.length() + 1; i++) {
            String cur = hayStack.substring(i, i + needle.length());
            if (cur.equals(needle)) return i;
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




