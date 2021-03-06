package dp;

public class d_121_ok_BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        System.out.println(maxProfit1(new int[]{7, 1, 5, -1, 3, 6, 4}));
    }


    public static int maxProfit1(int[] prices) {
        int start = 0, res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[start]) start = i;
            else res = Math.max(res, prices[i] - prices[start]);
        }
        return res;
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

todo solution


todo bug
 bug1
 bug2
 bug3
 */