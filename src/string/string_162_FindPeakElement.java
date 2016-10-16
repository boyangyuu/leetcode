package string;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class string_162_FindPeakElement {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                if (i == nums.length - 1 || nums[i] < nums[i + 1])
                    return i;
            }
        }
        return -1;
    }

}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */




