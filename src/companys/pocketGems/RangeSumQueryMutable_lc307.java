package companys.pocketGems;

/**
 * Created by yuboyang on 7/5/17.
 */
public class RangeSumQueryMutable_lc307 {
    /*

design a data structure to do update and query.
Follow up:
1.what if we do query a lot
2. what if we do both operations both quite often?
     */

    /*
    电面二，国人小哥
一道题  a data structure with function update(index, value) and query(start, end) to get ths sum between two index
follow up 1 update 少， query 多  : sum array
follow up 2 二者都很多，平衡树来做

     */

    int[] sums;
    int[] nums;
    public RangeSumQueryMutable_lc307(int[] nums) {
        this.nums = nums;
    }

    public void update(int i, int val) {

    }

    public int sumRange(int i, int j) {
        return 0;
    }
}
