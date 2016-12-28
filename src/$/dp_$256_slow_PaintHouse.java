package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 第一次做 accepted 但是思路慢, 先用树思考

public class dp_$256_slow_PaintHouse {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;

    }

    public static int minCost(int[][] costs) {
        int[] dp0 = new int[costs.length + 1];
        int[] dp1 = new int[costs.length + 1];
        int[] dp2 = new int[costs.length + 1];
        for (int i = 1; i < costs.length + 1; i++) {
            dp0[i] = Math.min(dp1[i - 1], dp2[i - 1]) + costs[i - 1][0];
            dp1[i] = Math.min(dp0[i - 1], dp2[i - 1]) + costs[i - 1][1];
            dp2[i] = Math.min(dp0[i - 1], dp1[i - 1]) + costs[i - 1][2];
        }
        return Math.min(Math.min(dp0[costs.length], dp1[costs.length]), dp2[costs.length]);
    }
}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######


 TODO case

 TODO bug
 bug1
 //
 =>
 if (res) return res; // todo bug 不写的话超时 case "++++++++++++"

 bug2
 bug3
 */




