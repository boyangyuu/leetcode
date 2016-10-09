package dp;

public class d_152_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
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

 fmax(i) = MAX(x[i] * fmax(i-1), x[i] * fmin(i-1), x[i]  )
 fmin(i) = MAX(x[i] * fmax(i-1), x[i] * fmin(i-1), x[i]  ) // same as uplow


 TODO case
[5,-1,6,7,-2]

 TODO bug

 bug1
 max modified, calculate min again then error , so add max1

 bug3
 负数的直接跳过,   todo bug1   负负得正

 */