package array;

public class a_66_plusOne {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int flag = 1;
        while(i >= 0 && flag == 1){
            int v = (digits[i] + 1 * flag) % 10;
            digits[i] = v;
            if (v == 0) flag = 1;
            else flag = 0;
            i--;
        }

        if (flag == 1) {
            // new
            int []ret = new int[digits.length + 1];
            for (int j = 0; j < ret.length; j++) {
                if (i == 0) {
                    ret[j] = 1;
                } else {
                    ret[j] = digits[j - 1];
                }
            }
            return ret;

        } else {
            return digits;
        }
    }
}

/** 题
 *
 * http:https://leetcode.com/problems/plus-one/
 *
 Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.

给定 代表数字的 数组, 加1, 求结果(数组表示,需考虑进位)

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 从 index 为l - 1 开始
 条件 i >= 0
 (nums[i] + 1) % 10 = 0 则进位, flag = 1 i--;
 != 0  则break

 flag == 1 则 重建数组


 flag != 1 则 return


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */