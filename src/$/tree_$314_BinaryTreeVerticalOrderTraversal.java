package $;

import tree.TreeNode;

import java.util.*;

// todo 学会利用hashmap的特性
public class tree_$314_BinaryTreeVerticalOrderTraversal {

    public static void main(String[] args) {


    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        help(root, map, 0);
        List<List<Integer>> res = new ArrayList();
        for (int i : map.keySet()) {
            System.out.println(i);
            res.add(map.get(i));
        }
        Queue<TreeNode> q = new LinkedList<>();

        return res;
    }

    public void help(TreeNode root, HashMap<Integer, List<Integer>> res , int offset) {
        if (root == null) return;
        if (!res.containsKey(offset)) res.put(offset, new ArrayList<>());
        res.get(offset).add(root.val);
        help(root.left, res, offset - 1);
        help(root.right, res, offset + 1);
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
