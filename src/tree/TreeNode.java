package tree;

import java.util.ArrayList;
import java.util.List;

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
        List<TreeNode> list = new ArrayList<>();
        list.add(this);
        while (list.size() != 0) {
            List<TreeNode> tmp = new ArrayList<>();
            for (TreeNode t : list){
                System.out.print(t.val + ", ");
                if (t.left != null) tmp.add(t.left);
                if (t.right != null) tmp.add(t.right);
            }
            list.clear();
            list = tmp;
            System.out.println();
        }

    }
}