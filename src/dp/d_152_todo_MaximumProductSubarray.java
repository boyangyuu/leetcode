package dp;


// bugfree todo 复习下思路即可
public class d_152_todo_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        //case normal
        System.out.println(maxProduct3(new int[]{0,2,-2,3,4}));

        //todo bug case 两个负数
        System.out.println(maxProduct3(new int[]{0,2,-2,3,-2,4}));
    }

    public static int maxProduct2(int[] nums) {
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dpMin[i] = nums[i];
                dpMax[i] = nums[i];
            }
            else {
                dpMin[i] = Math.min(nums[i] * dpMax[i - 1], Math.min(nums[i], nums[i] * dpMin[i - 1])); //todo bug
                dpMax[i] = Math.max(nums[i] * dpMin[i - 1], Math.max(nums[i], nums[i] * dpMax[i - 1]));
            }
            res = Math.max(res, dpMax[i]);
        }
        return res;
    }

    public static int maxProduct3(int[] nums) {
        int dpMax = 1, dpMin = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dpMin = nums[i];
                dpMax = nums[i];
            }
            else {
                int dpMinTmp = Math.min(nums[i] * dpMax, Math.min(nums[i], nums[i] * dpMin)); //todo bug
                dpMax = Math.max(nums[i] * dpMin, Math.max(nums[i], nums[i] * dpMax));
                dpMin = dpMinTmp;
            }
            res = Math.max(res, dpMax);
        }
        return res;
    }


    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ret = max;

        for (int i = 1; i < nums.length; i++) {
            int max1 = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]); // todo bug1
            min = Math.min(Math.min(max1 * nums[i], min * nums[i]), nums[i]); // todo bug1
            ret = Math.max(ret, max);
//            System.out.println("max "+max);
//            System.out.println("min "+min);
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
 this is a hard question
 result = Max(fm(1),fm(2),fm(3) .. f(m))

 fmax(i) the max pruduct ends with x[i]   for example 5,-1,6,7 : fm is 6 * 7
 fmin(i) the min product ends with x[i]

 fmax(i) = MAX(x[i] * fmax(i-1), x[i] * fmin(i-1), x[i]  ) todo 三者比较 (当前数, 当前数*上次最大,当前数*最小)
 fmin(i) = MAX(x[i] * fmax(i-1), x[i] * fmin(i-1), x[i]  ) // same as uplow


 TODO case
[5,-1,6,7,-2]

 TODO bug

 bug1
 dpMin[i] =  Math.min(nums[i], nums[i] * dpMin[i - 1]); //当前为负数的话, 乘以最大数 反而为最小
 =>
 dpMin[i] = Math.min(nums[i] * dpMax[i - 1], Math.min(nums[i], nums[i] * dpMin[i - 1])); //todo bug

 bug3
 负数的直接跳过,   todo bug1   负负得正

 */