package $;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 // todo sum[i,j] = sum[0, i] - sum[0, j], 利用map中找key 是O(1) 这一特性

// todo need codeing
public class hs_$325_todo_MaximumSizeSubarraySumEqualsk {

    public static void main(String[] args) {


    }

    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) max = i + 1;
            else if (map.containsKey(sum - k)) max = Math.max(max, i - map.get(sum - k));
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
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
 ######s1######
 方法1 较笨 剥皮法, 每次剥一层leaves
 traverse , in every row which is leaf should be added in res stack from right to left ,
 recursively next row


 方法2 标记深度值(深度越浅的, 深度值代表剥叶子批次, 则越先成为第一批次叶子)
 record the depth of every node, depth = 1 + Max.depth(cur.l, cur.r)
 the smaller the depth of the nodes, the index of the remove group they will be

 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
