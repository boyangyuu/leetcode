package array;

public class a_66_plusOne {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] res = new int[digits.length + 1];
        if (digits[0] == 0) {
            res[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                res[i+1] = digits[i];
            }


        };
        return res;
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

 todo 用 List 写
 {
    从尾部遍历 digits
    if digits[i] == 9 digits[i] = 0;
    else ++; return digits

 }


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