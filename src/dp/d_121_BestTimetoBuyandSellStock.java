package dp;

public class d_121_BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int ret = 0;
        int i = 0;
        int last = prices[0]; // i 以前的值
        while (i < prices.length){
            if (prices[i] <= last) {
                last = prices[i];
                i++;
            } else {
                ret = Math.max(ret, prices[i] - last);
                i++;
            }


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

 思路 :


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */