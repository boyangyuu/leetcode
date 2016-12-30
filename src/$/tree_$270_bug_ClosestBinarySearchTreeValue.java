package $;


import tree.TreeNode;

// todo learn int 与 double进行计算会自动转为 double 类型

// todo bug 不要轻易 return , 树状图里, 左侧树 很深的叶节点 一样可以无限接近当前跟, 比如case中的 2.8 相对于根节点 4
public class tree_$270_bug_ClosestBinarySearchTreeValue {
    public static void main(String[] args) {
        // todo
        System.out.println(1.00 - 1); // output : 0.0 double 类型

        // todo bug case
        /*
         4
        1 5
       0 2.8
         */
         // {4,1,5,0,2} 中 找2.9, output 为 4 , excepted 为 2.8 因为在1处 return掉了

    }
    static int res;
    public static int closestValue(TreeNode root, double target) {
        res = root.val;
        return res;
    }

    public static void help(TreeNode root, double target) {
        if (root == null) return;
        if (Math.abs(res - target) > Math.abs(root.val - target)) res = root.val;
//        else return; // todo bug case .. => //
        if (target > root.val) help(root.right, target);
        else help(root.left, target);
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
