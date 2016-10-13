package math;

public class math_43_MultiplyStrings {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public String multiply(String num1, String num2) {
        String res = "";
        if (num2.equals("0") || num1.equals("0")) return "0"; //todo bug5
        for (int i = num2.length() - 1; i >= 0; i--) {
            String cur = "";
            int v2 = num2.charAt(i) - '0';
            int carry = 0;
            for (int j = num1.length() - 1; j >= 0 ; j--) {
                int v1 = num1.charAt(j) - '0';
                cur = (carry + v1 * v2) % 10 + cur; //todo bug 1
                carry = (carry + v1 * v2)/ 10;
            }
            if(carry != 0) cur = carry + cur;  // todo bug2

            // extend cur
            int numsO = num2.length() - 1 - i;
            while(numsO-- >= 0) {
                cur += "0";
            }

            // res add cur
            res = add(res, cur);
        }
        return res;
    }

    public String add(String num1, String num2) {
        String res = "";
        int l1 = num1.length() - 1, l2 = num2.length() - 1, carry = 0;
        while(l1 >= 0 || l2 >= 0) {
            int v1 = l1 == 0 ? 0 : num1.charAt(l1--) - '0';
            int v2 = l2 == 0 ? 0 : num2.charAt(l2--) - '0';
            res = (v1 + v2 + carry) % 10 + res; // todo bug 4
            carry = (v1 + v2 + carry) / 10;
        }
        if (carry != 0) res = carry + res; // todo bug3
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
 TODO translation


 TODO solotion


 TODO case

 TODO bug

 bug1
 cur += (carry + v1 * v2) % 10; //todo bug 1
 =>
 cur = (carry + v1 * v2) % 10 + cur; //todo bug 1

 bug2
 //
 =>
 if(carry != 0) cur = carry + cur;  // todo bug2

 bug3
 //
 =>
 carry = (v1 + v2 + carry) / 10; // todo bug 3

 bug5
 //
 =>
 if (num2.equals("0") || num1.equals("0")) return "0"; //todo bug5
 case "111", "0"
 output : "0000"
 expected : "0"

 */

/*
TODO tutorial


 */
