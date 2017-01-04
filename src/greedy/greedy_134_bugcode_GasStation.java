package greedy;

// 10:12 -- 10:40 bug
// todo 需要重新code , 并且 试图用On 方法


public class greedy_134_bugcode_GasStation {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
        System.out.println(canCompleteCircuit(new int[]{4, 5}, new int[]{5, 4}));
    }


    /*
    O(n2)
        start from i, at current gas station, if remain gas add current 's
     gas >= cost , then move on until meet the start i again
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int cur = i;
            int rem = 0;
            while(rem + gas[cur] >= cost[cur]) {
                rem = rem - cost[cur] + gas[cur];
                cur++;
                if (cur >= gas.length) cur = cur % gas.length;
                if (cur == i) return i;
            }
        }
        return -1;
    }


    /*
        best solution O(n)
        point1、 if all gas >= cost (sum >= 0) , must exists one solution to complete the circuit

        point2、 during one pass, if break down at cur, then 0::cur cannot be the res

     */
    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int sum = 0, tmp = 0, res = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            tmp += gas[i] - cost[i];
            if (tmp < 0) {
                res = i + 1;
                tmp = 0;
            }
        }
        if (sum >= 0) return res;
        else return -1;
    }

}
/** 题
 *
 * http:https://leetcode.com/problems/jump-game/
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

todo solution

 */