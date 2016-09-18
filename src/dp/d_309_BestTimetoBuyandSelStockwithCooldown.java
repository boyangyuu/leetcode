package dp;

public class d_309_BestTimetoBuyandSelStockwithCooldown {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }
    
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int[] dp_selled = new int[prices.length+1];
        int[] dp_bought = new int[prices.length+1];
        //todo bug2 start
        dp_selled[0] = 0;
        dp_bought[0] = -prices[0];
        dp_selled[1] = Math.max(0, prices[1]-prices[0]);
        dp_bought[1] = Math.max(-prices[0],-prices[1]); // todo bug1!

        //todo bug2 end
        for (int i = 2; i < prices.length; i++) {
            int v = prices[i];
            dp_selled[i] = Math.max(dp_bought[i-1] + v, dp_selled[i-1]);
            dp_bought[i] = Math.max(dp_selled[i-2] - v, dp_bought[i-1]); //todo bug3 买完可以次日卖 反之不可以
            System.out.println("dp_selled[i]:"+ dp_selled[i]);
            System.out.println("dp_bought[i]:"+ dp_bought[i]);
        }
        return dp_selled[prices.length-1];
    }
}
/** 题
 *
 * http:
 *

买完可以次日卖 反之不可以
 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 TODO solotion
 f(n, selled) stands for the maxProfit until the index n , status equal "selled"

 f(n, selled) = {
     f(n-2,selled) + x(n),
     f(n-1,bought)
 }

 f(n, bought) = {
 f(n-2,selled) - x(n),
 f(n-1,bought)
 }



 TODO case

 TODO bug

 bug1
 小心 可以第1,2日买
 bug2
 前两个数 需要自己构造 ,另外 dp_selled[0] = 0;
 bug3
 */