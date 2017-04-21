package 面经.amz;

import java.util.*;

/**
 * Created by yuboyang on 2/21/17.
 */

/*

find the maximum avg subtree
 */

class Node { //这个是题目给好的
    int val;
    ArrayList<Node> children;
    public Node(int val){
        this.val = val;
        children = new ArrayList<Node>();
    }
}

class SumCount{
    int sum;
    int count;
    public SumCount(int sum, int count){
        this.sum = sum;
        this.count = count;
    }
}

public class Company_Tree {
    public static double maxAvg = 0;
    public static Node res = null;

    public static void main(String[] args) {
        Node root = new Node(1);
        Node l21 = new Node(2);
        Node l22 = new Node(3);
        Node l23 = new Node(4);
        Node l31 = new Node(5);
        Node l32 = new Node(5);
        Node l33 = new Node(5);
        Node l34 = new Node(5);
        Node l35 = new Node(5);
        Node l36 = new Node(5);

        l21.children.add(l31);
        l21.children.add(l32);

        l22.children.add(l33);
        l22.children.add(l34);

        l23.children.add(l35);
        l23.children.add(l36);

        root.children.add(l21);
        root.children.add(l22);
        root.children.add(l23);

        Node res1 = getHighAve(root);
        System.out.println(res1.val + " " + res1);
        System.out.println(maxAvg);
        System.out.println(3.0/ 2);
        System.out.println((double) 3 / 2);
        System.out.println( (char) ('a' + 1));
    }

    public static Node getHighAve(Node root){
        if (root == null) return null; // todo
        help(root);
        return res;
    }

    public static SumCount help(Node root) {
        if (root.children.size() == 0) {
            return new SumCount(root.val, 1);
        }

        int sum = root.val, cnt = 1;
        for (Node e : root.children) {
            sum += help(e).sum;
            cnt += help(e).count;
        }
        if ((double) sum / cnt > maxAvg) {
            maxAvg = (double) sum / cnt; // todo 注意这里的double 位置 , double 使得sum 为 double类型, 之后计算值自然为doule

            // todo  注意 (double) (3 / 2) 为 1, not 1.5, 由于3,2均为int 结果为1 , ==> double (1) => 1
            res = root;
        }

        return new SumCount(sum, cnt);
    }


}
