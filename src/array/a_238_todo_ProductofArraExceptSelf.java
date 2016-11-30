package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class a_238_ProductofArraExceptSelf {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        int[] res = productExceptSelf1(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf1(int[] nums) {
        int left = 1, right = 1;
        int[] res = new int[nums.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = left;
            left *= nums[i];
        }

        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }


    public int[] productExceptSelf(int[] nums) {
        int [] ret = new int [nums.length];
        int sum = 1;
        // ret 每个元素存 前面的乘积值
        for (int i = 0; i < nums.length; i++) {
            ret[i] = sum;
            sum *= nums[i];
        }

        //后面
        sum = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ret[i] = ret[i] * sum;
            sum *= nums[i];
        }
        return ret;
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

todo solution
每个数字 = 前面数字乘积 * 后面数字乘积
 先遍历求每个数字的前面数字乘积
 再反向



todo bug
 bug1
 bug2
 bug3
 */