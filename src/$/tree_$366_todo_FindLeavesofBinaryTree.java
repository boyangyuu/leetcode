package $;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// todo 注意一下一个很小的 bug case即可 简单题目
public class tree_$366_todo_FindLeavesofBinaryTree {

    public static void main(String[] args) {


    }

    /*
    solution 1 easy to understand,
     */
    public static List<List<Integer>> findLeaves1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        help(root, res);
        return res;
    }

    public static int depth1(TreeNode root) {
        if (root == null) return -1;
        int depth =  1 + Math.max(depth1(root.left), depth1(root.right)); //todo bug 1 min => max
        return depth;
    }

    public static void help(TreeNode root, List<List<Integer>> res) {
        if (root == null) return;
        int h = depth1(root);
        while (res.size() <= h) res.add(new ArrayList<>());
        res.get(h).add(root.val);
        help(root.left, res);
        help(root.right, res);
    }

    /*
    best solution
     */
    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        depth(root, res);
        return res;
    }

    public static int depth(TreeNode root, List<List<Integer>> res) {
        if (root == null) return -1;
        int depth =  1 + Math.max(depth(root.left, res), depth(root.right, res)); //todo bug 1 min => max
        while (res.size() <= depth) res.add(new ArrayList<>());
        res.get(depth).add(root.val);
        return depth;
    }

    /*
    solution 方法1 较笨 剥皮法, 每次剥一层leaves
     */

    public static List<List<Integer>> findLeaves2(TreeNode root) {
        List<List<TreeNode>> res = new ArrayList<>();
        List<List<Integer>> res1 = new ArrayList<>();
        List<TreeNode> last = new ArrayList<>();
        res.add(0, last);

//        for (List<TreeNode> l : res)
//            res1.add(new ArrayList<>());
//            for (TreeNode t : l)
//                res1.get();
        for (int i = 0; i < res.size(); i++) {
            List<TreeNode> l = res.get(i);
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < l.size(); j++) {
                t.add(l.get(j).val);
            }
            res1.add(t);
        }

        return res1;
    }

    public static void help1(List<List<Integer>> res, List<TreeNode> t) {
        List<Integer> cur = new ArrayList<>();

        for (TreeNode node : t) {
            if (node.left == null && node.right == null) cur.add(0, node.val);

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
