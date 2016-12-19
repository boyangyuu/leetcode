package dp;

// todo 思路略慢, 5分钟, 下次复习时候仅需要思路

// todo 两者思路 非常相似,
// todo point  都说出来 会很有亮点!
public class d_213_todo_HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    /*
    * s1  不考虑nums[l-1], 不考虑nums[0] 两种情况作比较
    * todo s2  不选nums[0], 选nums[0] 两种情况作比较
    */
    public static int rob1(int[] nums) {
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 1) return nums[0];
        if (nums.length == 0) return 0;

        // choose nums[0]
        int fn_2 = nums[0], fn_1 = nums[0];
        for (int i = 2; i < nums.length - 1; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        int ret = fn_1;

        // not choose nums[0]
        fn_2 = 0; fn_1 = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        ret = Math.max(ret, fn_1);
        return ret;
    }

    /*
    * todo s1  不考虑nums[l-1], 不考虑nums[0] 两种情况作比较
    * s2  不选nums[0], 选nums[0] 两种情况作比较
    */
    public int rob(int[] nums) {
        if (nums.length == 2) return Math.max(nums[0], nums[1]); // todo bug1
        if (nums.length == 1) return nums[1];
        if (nums.length == 0) return 0;

        // ignore the last one
        int fn_2 = nums[0], fn_1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        int ret = fn_1;

        // ignore the first one
        fn_2 = nums[1]; fn_1 = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            int fn = Math.max(fn_2 + nums[i], fn_1);
            fn_2 = fn_1;
            fn_1 = fn;
        }

        ret = Math.max(ret, fn_1);
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

 TODO solotion

 f(n) = f(n-2) + x[n] selected x[n]
 or f(n) = f(n-1)     unselected x[n]
 select max one

 choose x[0] end to n-1
 not choose x[0] end t0 n


 TODO case

 TODO bug

 bug1 别忘了 首尾可以选1个的

 bug2
 bug3
 */