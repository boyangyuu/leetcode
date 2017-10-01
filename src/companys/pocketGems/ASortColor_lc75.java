package companys.pocketGems;

import java.util.Arrays;

/**
 * Created by yuboyang on 7/5/17.
 */
public class ASortColor_lc75 {
    /*
class thing{
   int getPriority();// 0,1,2,3
}

请用 linear time的方法来 sort yi 一个 arraylist<thing> things; 注意sort 是按照getPriority()的取值来排序【112300120】=>[000111223] 其中数字实则都是getPrioirty()的取值. 涓€浜�-涓夊垎-鍦帮紝鐙鍙戝竷
其实感觉就是 sort 3 colors 翻版！ 唯一不同的是这里相当于4种颜色！
我当时用 用俩while loop 先sort 0和3， 再sort 1和2. 1point 3acres 璁哄潧



     */
    /*

    https://leetcode.com/problems/sort-colors/#/description

f1
    Sort color
Sort color, 4个follow up(分别用暴力计数，
 in-place Swap, Sort object comparer, 4色in-place)
 ，最后一个4色我是没做出来的，但白人面试官给我过了。
     */


    // space O(1), 1 pass
    public static void main(String[] args) {
        int[] test = new int[] {1,2,0,1,1,2,0,2};
        test = new int[] {1,2,0};
        test = new int[] {0};
        test = new int[] {1,1,4,3,3,1,2,3,4};
        sortColors(test);
        System.out.println(Arrays.toString(test));

    }
    public static void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1; // index for next 0, 2
        for (int k = 0; k < nums.length; k++) {
//            if (i >= j) break;
            if (nums[k] == 0 && k >= i) swap(nums, i++, k--);
            else if (nums[k] == 2 && k <= j) swap(nums, j--, k--);
            else {
            }
        }
    }

    //  k colors
    public static void sortColors2(int[] nums) {
        int i = 0, j = nums.length - 1; // index for next 0, 2
        int min = 0, max = 4;
        while (min < max) {
            for (int k = 0; k < nums.length; k++) {
//            if (i >= j) break;
                if (nums[k] == min && k >= i) swap(nums, i++, k--);
                else if (nums[k] == max && k <= j) swap(nums, j--, k--);
                else {
                }
            }
            min++;
            max--;
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // four colors 0, 1, 2, 3


}
