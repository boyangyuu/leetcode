package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class tree_0_tutorial {
    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;
        List<Integer> list = new ArrayList<>();

        level2(root);
    }

    // 树的插入
    public TreeNode insert(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        else if(val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        LinkedList<Integer> list;


        return root;
    }

    // todo 知道每行的 层序遍历   question 199,
    public static void level2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list.isEmpty() == false) {
            List<TreeNode> t = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                TreeNode cur = list.get(i);
                System.out.print(cur.val + ",");
                if (i == list.size() - 1) System.out.println();;
                if (cur.left != null) t.add(cur.left);
                if (cur.right != null) t.add(cur.right);
            }
            list = t;
        }
    }

    // todo honrizontal, breath first
    void level(TreeNode root) {
        // 一遍层序遍历
    }

    // todo 前序 左儿子入栈,且输出 https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/
    void pre(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null) {
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
    }


    //   todo 中序 有左儿子进栈 其实就是模仿递归
    void middle(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null) { // left recursive
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.val);
            cur = cur.right; // right recursive
        }
    }



}
/**
 *

 TODO tutorial
 todo
 掌握前后中序特性
 学会将问题 转化为 递归问题



 todo complete binary tree
    深度为d 除了d层其他各层均达到满, 且第d层从左到右连续紧密排列
 case 下面这个就是
    1
   2 3
 1

 todo full binary tree
    每层均满


 */


