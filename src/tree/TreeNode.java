package tree;

/**
 * Created by yuboyang on 9/27/16.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public void print() {
        if (this == null) return;
        System.out.println(this.val);
        if (this.left != null) this.left.print();
        if (this.right != null) this.right.print();
    }
}