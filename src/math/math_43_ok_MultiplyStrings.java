package math;


// 12/21 6:35 - 7.11 36minutes
public class math_43_ok_MultiplyStrings {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(add1("11", "9"));
        System.out.println(add1("1", "12"));
        System.out.println(multiply1("11", "11"));
        System.out.println(multiply1("10", "12"));

        // corner case
        System.out.println(multiply1("0", "12"));
        System.out.println(multiply1("55", "55"));
    }

    public static String multiply1(String num1, String num2) {
        String res = "0", diff = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            int v1 = num1.charAt(i) - '0';
            int carry = 0;
            String mres = "" + diff;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int v2 = num2.charAt(j) - '0';
                mres = (carry + v2 * v1) % 10 + mres;
                carry = (carry + v2 * v1) / 10;
            }
            if (carry > 0) mres = carry + mres;
            diff += "0";
            res = add1(res, mres);
        }

        if (res.charAt(0) == '0') return "0";
        return res;
    }


    public static String add1(String pre, String cur) {
        String res = "";
        int i = pre.length() - 1, j = cur.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int pv = i < 0 ? 0 : pre.charAt(i--) - '0';
            int pc = j < 0 ? 0 : cur.charAt(j--) - '0';
            int sum = (pv + pc + carry) % 10;
            carry = (pv + pc + carry) / 10;
            res = sum + res;
        }
        if (carry == 1) res = 1 + res;
        return res;
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
