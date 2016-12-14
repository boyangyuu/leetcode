package math;

//2 minutes
public class math_171_ExcelSheetColumnNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        char c = (char)('A' + 1);
        System.out.println(c);
        System.out.println(titleToNumber1("AB"));
    }

    public static int titleToNumber1(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'A' + 1;
            res = res * 26 + cur;
        }
        return res;
    }










    public int titleToNumber(String s) {
        int res = 0, index = s.length() - 1, power = 0;
        while (index >= 0) {
            char cur = s.charAt(index--);
            int v = cur - 'A' + 1;
            res += v * Math.pow(26, power++);
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
 10 format converts to 26 format
 10进制转换为26进制 , 进制 :format

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
 n -= (n-1) % 26; //TODO bug 2 , 每次都需要减去当前的字母值

 bug3
 */

/*
TODO tutorial


 */
