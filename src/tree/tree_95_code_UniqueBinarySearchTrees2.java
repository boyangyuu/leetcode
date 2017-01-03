package tree;

import java.util.ArrayList;
import java.util.List;


// todo dp , 题目还行吧 ,比较创新
// 先学会 96题, 之后利用 96的左右子树构造方式去构造(copy)
// 其中 copy方法 , 只copy结构, 里面的value += root节点值

public class tree_95_code_UniqueBinarySearchTrees2 {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;

        root.print();
        copy(root, 3).print();
    }


    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] dp = new List[n + 1]; // dp[i] 为 i个元素 (1::i)
        dp[0] = new ArrayList<>(); // todo bug
        if (n == 0) return dp[0];
        dp[0].add(null);
        for (int i = 1; i <= n; i++) {
            dp[i] = new ArrayList<>();

            for (int j = 1; j <= i; j++) { // 根节点的范围 l have j nodes, so right side have i - j - 1
                for(TreeNode nodeL : dp[j - 1]) {
                    for (TreeNode nodeR : dp[i - j]) {
                        TreeNode root = new TreeNode(j);
                        root.left = nodeL;
                        root.right = copy(nodeR, j);
                    }
                }
            }
        }
        return dp[n];
    }

    //keep the structure, but every element's value is increased by offset
    public static TreeNode copy(TreeNode root, int offset) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val + offset);
        node.left = copy(root.left, offset);
        node.right = copy(root.right, offset);
        return node;
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

 接96 的思路 , dp[i] = {
 root = 1, root.left = {0} root.right{2::i} (root 1::i-1) => dp(0), dp[i-1]
 root = 2 ..
 root = 3 ..
 root = i
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
 dp[0] = new ArrayList<>(); // todo bug
 =>
 dp[0] = new ArrayList<>();
 dp.add(null); // todo


 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
