package tree;


import java.util.Stack;

public class tree_0_tutorial {
    public static void main(String[] args) {
        TreeNode root;
    }

    /*
        左儿子入栈,且输出
     */
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

    /*
        有左儿子进栈
     */

    void middle(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.val);
            cur = cur.right;
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


