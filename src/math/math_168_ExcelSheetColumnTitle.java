package math;

public class math_168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        char c = (char)('A' + 1);
        System.out.println(c);
    }

    public String convertToTitle(int n) {
        String res = "";
        while (n > 0) {
            char c = (char)('A' + (n - 1) % 26); // todo bug 1
            res = c + res; //todo bug3
            n -= (n-1) % 26;   //todo bug 2
            n /= 26;
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
 商为下次 的n
 余数为当前字母的值

 TODO case

 TODO bug

 bug1
 char c = (char)('A' + n % 26 - 1);
 =>
 char c = (char)('A' + (n - 1) % 26); // todo bug 1


 bug2
 //
 =>
 n -= (n-1) % 26; //TODO bug 2

 bug3
 */

/*
TODO tutorial


 */
