package companys.zenefit;

import java.util.Arrays;

/**
 * Created by yuboyang on 8/20/17.
 * http://www.1point3acres.com/bbs/thread-289071-1-1.html
 */
public class MoveZeroes {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,3,12};
        int[] arr = {9,1,2,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
    [1,3,12,0,0]
    i: 0 index : 0
    i: 1 index : 1
    i: 2 index : 1
    i: 3 index : 2
    i: 4 index : 3
    [1,2]

     */
    public static void moveZeroes(int[] nums) {
        int indexOfNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[indexOfNonZero];
                nums[indexOfNonZero] = nums[i];
                nums[i] = temp;
                indexOfNonZero++;
            }
        }
    }
}
