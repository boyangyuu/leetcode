package math;

public class math_8_StringtoIntegeratoi {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int myAtoi(String str) {
        if(str.length() == 0) return 0;
        long res = 0;
        int flag = 1;
        int i = 0;

        // step 1
        while (i < str.length() - 1 && str.charAt(i) == ' ') i++; //todo bug 1

        // step 2
        if (str.charAt(i) == '-') {flag = -1; i++;}
        else if (str.charAt(i) == '+') {flag = 1; i++;}

        // step 3
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            res = res * 10 + (str.charAt(i++) - '0');
            if (res * flag > Integer.MAX_VALUE) return Integer.MAX_VALUE; //todo bug 3
            else if(res * flag < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        }
        return (int)res * flag; // todo bug 3
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
 step 1
 space

 step 2
 +,_

 step 3
 get the num

 TODO case

 TODO bug

 bug1
 while (str.charAt(i) == ' ') i++; //todo bug 1
 =>
 while (i < str.length() - 1 && str.charAt(i) == ' ') i++; //todo bug 1 时刻判断是否越界

 bug2
 bug3

 if (res * flag > Integer.MAX_VALUE) return 0; //todo bug 3
 =>
 if (res * flag > Integer.MAX_VALUE) return Integer.MAX_VALUE; //todo bug 3 注意题干要求, 超过则返回边界值
 */

/*
TODO tutorial


 */
