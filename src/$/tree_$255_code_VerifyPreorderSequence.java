package $;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 容易出bug
public class tree_$255_code_VerifyPreorderSequence {

    public static void main(String[] args) {
//        System.out.println(verifyPreorder(new int[] {5,3,1,4,8,7,9}));
//        System.out.println(verifyPreorder(new int[] {5,3,1,4,8,3,9}));

        // todo bug
        System.out.println(verifyPreorder(new int[] {1,2}));

    }

    // s1 分治法, 太容易出bug 小心 (root, left, right ) and check every e in right subarray is smaller than root
    public static boolean verifyPreorder(int[] preorder) {
        if (preorder.length == 0) return false;
        return help(preorder, 0, preorder.length - 1, Integer.MIN_VALUE);
    }

    public static boolean help(int[] preorder, int i, int j, int min) {
        if (i >= j) return preorder[i] >= min;
        int mid = -1;
        for (int k = i; k <= j; k++) {
            if (preorder[k] < min) return false;
            if (preorder[k] > preorder[i] && mid == -1) {
                mid = k;
            }
        }

        if (mid == -1) {
            return help(preorder, i + 1, j, Integer.MIN_VALUE);
        } else {
            return help(preorder, i + 1, mid - 1, Integer.MIN_VALUE)
                    && help(preorder, mid, j, preorder[i]);
        }
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
