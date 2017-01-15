package hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
// todo  learn 利用iterator 的话 是要用Iterator 去remove的, 否则会出错
// todo 替代方案是直接 foreach nums[] 即可
public class hs_128_todo_LongestConsecutiveSequence {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }
        //  set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){}

        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    /*
        add all elements into set or map, then foreach all the elements, and find its previous and next element and delete at same time.
        for instance {100,4,1,3,2} 4 pre->3(delete)->2(delete)->1(delete) res = 4, then traverse 100 in {100}
    */

    // 主要技术, 利用key换时间, 注意边查边删除技术, 这样可以O(n)
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // value -> 0
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) == false) continue;
            int cnt = 1;

            // prev
            int prev = nums[i] - 1;
            while(set.remove(prev--)) // todo  利用iterator 的话 是要用Iterator 去remove的, 否则会出错
                cnt++;

            // next
            int next = nums[i] + 1;
            while (set.remove(next++))
                cnt++;

            res = Math.max(res, cnt);
            set.remove(nums[i]);
        }
        return res;
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
 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--

 TODO case

 TODO bug

 TODO follow
 todo#! 有时可以用set 优化map


 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
