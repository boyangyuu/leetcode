package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo 第一次做 accepted 但是思路慢, 先用树思考

public class dp_$276_slow_PaintFence {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;
        System.out.println(numWays(2,11));
        System.out.println(numWays(3,11));
    }

    public static int numWays(int n, int k) {
        if (n == 1) return k;
        if (n == 2) return k * k;
        int[] dp = new int[n];
        dp[0] = k;
        dp[1] = k * k;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] * (k - 1) + dp[i - 2] * (k - 1);
        }
        return dp[n - 1];
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




