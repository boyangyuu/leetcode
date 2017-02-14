package hashTable;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class hs_349_IntersectionofTwoArrays {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }
        // set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){}
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> l = new ArrayList();
        //
        return null;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                if (!set.contains(nums1[i])) set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ret = new int[set.size()];
        int index = 0;
        for (int v : set)
            ret[index++] = v;

        return ret;

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
1.
    map or set


 todo! 用两个set 一个维护表 一个村结果 再转换

 2、todo! 尝试用 两个指针做
先排序, 之后
 {
    if (nums1[i] < nums2[j]) ++i; //
    else if (nums1[i] > nums2[j]) ++j;
    else {
        if (res.empty() || res.back() != nums1[i]) {
        res.push_back(nums1[i]);
         }
        ++i; ++j;
    }
 }



 TODO case

 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
