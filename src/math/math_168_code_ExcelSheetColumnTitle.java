package math;


// todo 复习思路, 严格地写!!
public class math_168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
//        char c = (char)('A' + 1);
//        System.out.println(c);

        // todo bug case
        System.out.println(convertToTitle1(26 * 26));
    }

    public static String convertToTitle1(int n) {
//        int i = 0;
        String res = "";
        while (n != 0) {
            int rem = n % 26;
            int index = (rem + 25) % 26; // 当前位数value 注意
            res = (char)('A' + index) + res;
            n = n - (index + 1);
            n /= 26;
        }
        return res;
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
 26 * 26 = 26(Z) + 25 * 26(F*) = FZ

 todo Z =>n - 26 => n /= 26 => n = 25 => F


 10 format converts to 26 format
 10进制转换为26进制 , 进制 :format

 商为下次 的n
 余数为当前字母的值

 TODO case

 TODO bug
 case 26 * 26
 => res + "Z" : 26 * 26 / 26 = 0 ("Z") , (26 * 26) / 26 = 25
 =>res + YZ :


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
