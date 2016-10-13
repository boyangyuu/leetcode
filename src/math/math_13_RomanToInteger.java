package math;

import java.util.HashMap;

public class math_13_RomanToInteger {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);map.put('V', 5);map.put('X', 10);map.put('L', 50);map.put('C', 100);
        map.put('D', 500);map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int v1 = map.get(s.charAt(i));
            if (i == s.length() - 1) {
                res += v1;
                continue;
            }
            int v2 = map.get(s.charAt(i + 1));
            if (v1 < v2) res -= v1;
            else res += v1;
        }
        return res;

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

 TODO solotion

 遍历字符串, {
    if 当前字符 小于下一个字符 res -= curv
    else res += curv
 }

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial


 */
