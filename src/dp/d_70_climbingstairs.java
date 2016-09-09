package dp;

import java.util.*;

public class d_70_climbingstairs {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
//        System.out.print(1);
    }

    public int climbStairs(int n) {
//        HashMap<Integer, Integer> map = new HashMap();
//        return recursiveClimbStairs(n, map);
        if (n <= 2) return n;
        int[] ret = new int[n];
        ret[0] = 1;
        ret[1] = 2;
        for (int i = 2; i < n; i++) {
           ret[i] = ret[i - 1] + ret[i - 2];
        }
        return ret[n - 1];

    }

    public int recursiveClimbStairs(int n, HashMap<Integer, Integer> maps){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (maps.containsKey(n)) {
            return maps.get(n);
        }
        maps.put(n, climbStairs(n-1) + climbStairs(n-2) + 2);
        return maps.get(n);
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

 1.最优化原理（最优子结构性质） 最优化原理可这样阐述：一个最优化策略具有这样的性质，不论过去状态和决策如何，对前面的决策所形成的状态而言
 ，余下的诸决策必须构成最优策略。简而言之，一个最优化策略的子策略总是最优的。一个问题满足最优化原理又称其具有最优子结构性质。
 2.无后效性将各阶段按照一定的次序排列好之后，对于某个给定的阶段状态，它以前各阶段的状态无法直接影响它未来的决策，而只能通过当前的这个状态。
 换句话说，每个状态都是过去历史的一个完整总结。这就是无后向性，又称为无后效性。
 3.子问题的重叠性 动态规划将原来具有指数级时间复杂度的搜索算法改进成了具有多项式时间复杂度的算法。其中的关键在于解决冗余，这是动态规划算法
 的根本目的。动态规划实质上是一种以空间换时间的技术，它在实现的过程中，不得不存储产生过程中的各种状态，所以它的空间复杂度要大于其它的算法。
 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */