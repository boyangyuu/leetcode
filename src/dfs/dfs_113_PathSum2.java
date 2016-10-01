package dfs;

import tree.TreeNode;

import java.util.*;

public class dfs_113_PathSum2 {
    public static void main(String[] args) {
        //TreeNode
        TreeNode node;
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        help(root, sum, list, lists);
        return lists;
    }

    public void help(TreeNode root, int sum, List<Integer> curList, List<List<Integer>> list) {
        if (root == null) {
            if (sum == 0 && curList.size() != 0) list.add(new ArrayList<Integer>(curList)); //todo!! bug2 bug 4
            return;
        }
//        if (sum - root.val < 0) return; // todo!!! bug 1 promote

        curList.add(root.val);
        if (root.left == null)  {
            help(root.right, sum - root.val, curList , list);
        }
        else if (root.right == null) {
            help(root.left, sum - root.val, curList, list);
        }
        else {
            help(root.right, sum - root.val, curList , list);
            help(root.left, sum - root.val, curList, list);

        }
        curList.remove(curList.size() - 1); //todo!! bug3
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
 review the pathsum 112 first

 f(root, sum, list, lists) = {
    list.add(root.val);
    f(root.left, sum - cur.val, list, lists);
    f(root.right, sum - cur.val, list, lists);
 }



 TODO case

 TODO bug
 bug1
 if (sum - root.val < 0) return; // todo!!! bug 1 promote
 =>
 //
 case : [-2,-3] -5
 output []
 expected [[-2,-3]]

 bug2
 if (sum == 0 ) list.add(new ArrayList<Integer>(curList)); //todo!! bug2
 =>
 if (sum == 0 && curList.size() != 0) list.add(new ArrayList<Integer>(curList)); //todo bug2
 case: [] 0
 output [[]]
 expected []


 bug3
 //
 =>
 curList.remove(curList.size() - 1); //todo!! bug3
 reason : other recursive will use the same list too!

 bug4
 if (sum == 0 ) list.add(curList); //todo!! bug4
 =>
 if (sum == 0 ) list.add(new ArrayList<Integer>(curList)); //todo!! bug4
 reason : other recursive will use the same list too!

 */

/*
TODO tutorial


TODO follow


 */
