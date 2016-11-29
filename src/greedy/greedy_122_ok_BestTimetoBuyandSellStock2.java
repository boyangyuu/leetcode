package greedy;

public class greedy_122_ok_BestTimetoBuyandSellStock2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        System.out.println(maxProfit1(new int[]{10,1,2,3,7,100,99,5}));
        System.out.println(maxProfit1(new int[]{1,2,7,6,99,5}));
    }

    public static int maxProfit1(int[] prices) {
        boolean bought = false;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (!bought) {
                if (i != prices.length - 1 && prices[i] < prices[i + 1]) {
                    res -= prices[i];
                    bought = true;
                }
            } else {
                if (i == prices.length - 1 || prices[i] > prices[i + 1]) {
                    res += prices[i];
                    bought = false;
                }
            }
        }
        return res;
    }










    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int ret = 0;
        int i = 0;
        int last = -1; // i 以前的值
        while (i < prices.length){
            if (last == -1) {
                last = prices[i];
                i++;
            }
            else if (prices[i] <= last) {
                last = prices[i];
                i++;
            } else {
                int p = prices[i] - last;
                ret += p;
                last = -1;
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

 从tmp起 每次找后面直到小于tmp的子数组中 差距最大的值 作为交易


 本答案用了个技巧 就是  3 4 5 1, 正常 应该是 5-3 , 而我做的 -3 + 4 -4 + 5 操作上不允许 结果其实是一样的
todo bug
 bug1
 bug2
 bug3
 */