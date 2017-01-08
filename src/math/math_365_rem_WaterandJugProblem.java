package math;

public class math_365_review_WaterandJugProblem {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public boolean canMeasureWater(int x, int y, int z) {
        return z == 0 || z <= (x + y) && z % GCD(x, y) == 0;
    }


    /// todo memorize
    public int GCD(int x, int y) { // 最大公约数
        return y == 0 ? x : GCD(y, x % y);
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
 bug2
 bug3
 */

/*
TODO tutorial


 */
