package hashTable;
import java.util.*;

public class hs_136_SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.remove(nums[i]);
                sum -= nums[i];
            } else {
                map.put(nums[i], true);
                sum += nums[i];
            }

        }
        return sum;
    }

    public int singleNumber1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];

        }
        return nums[0];
    }
}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion

 方法1 存进去,有则删除, 最后剩下的就是唯一的

 方法2 异或 相同数字异或为0 ,0亦或 目标值 不变
 异或 1 ^ 0= 1　　假^真=真　　假^假=假　　真^真=假
 与   1 & 1 = 1
 与

 TODO case

 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
