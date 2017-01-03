package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// todo 理解性地记住思路, 看solution 其实本题是组合问题
public class tree_96_rem_UniqueBinarySearchTrees {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;

        System.out.println(numTrees(3));
    }


    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                tmp += dp[j] * dp[i - j - 1];
            }
            dp[i] = tmp;
        }
        return dp[n];
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
 dp[i] : 节点数为i时的可行解 todo 注意: dp[2]{1,2}  与dp[2]{1,3} 是相等的


 dp[i] = {
 root 为0 => 左节点可行解数 * 右节点可行解数 = dp[0]右面节点数目为0) * dp[i]
 root 为1 =>

 ..
 root 为i
 }


 举例, dp[3] = {
 case todo 1为根,  可行解{null} * 可行解{2,3} == 可行解{null} * 可行解({1,2} == dp[0] * dp[2]

 }

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

 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
