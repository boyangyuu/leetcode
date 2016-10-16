package binarySearch;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class bs_167_twoSum2 {
    public static void main(String[] args) {
        List list;Map map;Set set;
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length + 1;
        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) j--;
            else i++;
        }

        return new int[]{i+1, j+1};
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




