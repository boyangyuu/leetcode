package companys.pocketGems;

/**
 * Created by yuboyang on 7/8/17.
 */
public class SegmentTreeSample {
    public static void main(String[] args) {
        SegmentTreeSample sample = new SegmentTreeSample(new int[]{1,3,5});
        System.out.println(sample.sumRange(0, 2));
        sample.update(1, 2);
        System.out.println(sample.sumRange(0, 2));

    }

    class SegmentTreeNode {
        int start, end, sum = 0;
        SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    int[] nums;
    SegmentTreeNode root = null;

    public SegmentTreeSample(int[] nums) {
        this.nums = nums;
        this.root = buildTree(nums, 0, nums.length - 1);
    }

    private SegmentTreeNode buildTree(int[] nums, int i, int j) {
        SegmentTreeNode ret = new SegmentTreeNode(i, j);
        if (i > j) return null;
        if (i == j) {
            ret.sum = nums[i];
        } else {
            int mid = i + (j - i) / 2;
            SegmentTreeNode left = buildTree(nums, i, mid);
            SegmentTreeNode right = buildTree(nums, mid + 1, j);
            ret.left = left;
            ret.right = right;
            ret.sum = ret.left.sum + ret.right.sum;
        }
        return ret;
    }

    void update(int i, int val) {
        update(root, i, val);
    }

    void update(SegmentTreeNode root, int i, int val) {
        if (root.start == root.end) {
            root.sum = val;
            return;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if (i <= mid) {
            update(root.left, i, val);
        } else {
            update(root.right, i, val);
        }

        root.sum = root.left.sum + root.right.sum;
    }

    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }

    public int sumRange(SegmentTreeNode root, int i, int j) {
        if (root.start == i && root.end == j) return root.sum;
        int mid = root.start + (root.end - root.start) / 2;
        if (j <= mid) {
            return sumRange(root.left, i, j);
        } else if (i > mid) {
            return sumRange(root.right, i, j);
        } else {
            return sumRange(root.left, i , mid) + sumRange(root.right, mid + 1, j);
        }

    }
}
