package companys.audible;

/**
 * Created by yuboyang on 7/15/17.
 *https://leetcode.com/problems/missing-number/#/description
 * http://www.1point3acres.com/bbs/thread-226590-1-1.html
 *
 *
 * They asked me to design a restaurant reservation system (classes and methods). also write algorithm to decide if a binary tree is mirrored. Also order set B according to the order of set A, where A is a superset of B.
 *
 * todo follow up : duplicate elements
 */
public class AAAMissNumber__1 {
    int missingNumber2(int[] nums) {
        int sum1 = 0;
        for (int x : nums) sum1 += x;
        int minV = 0, maxV = nums.length;
        int sum2 =  (minV + maxV) * (nums.length + 1) / 2;
        return sum2 - sum1;
    }


    /*
    input output : is the elements distinct or duplicate,
    case: 0, 2, 1 => 3;  0, 2, 1, 3 => 4
    idea: use array to count the appearance from 0 to n; after one scan,
    costing : O(2 * n) , O(n) space

    */
    public int missingNumber1(int[] nums) {
        return 0;
    }

    /*
    case: 0, 2, 1 => 3

    0, 1, 2

    idea: forloop the array, once the element's value not equals to its index, put it into the place that
    it should be, swap this element to another element which is in its position.

    0, 2, 1
    i0:
    i1: 0, 1, 2 => ...
    i2:


    */

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                int index = nums[i];
                nums[i] = nums[index]; // todo bug , nums[i] = nums[nums[i]]; .. 这样写不对
                nums[index] = index;
                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }


}
