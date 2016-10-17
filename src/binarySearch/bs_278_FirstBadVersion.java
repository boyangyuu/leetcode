package binarySearch;


public class bs_278_FirstBadVersion {
    public static void main(String[] args) {


    }

    public boolean isBadVersion(int version){
        return true;
    }


    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = (right - left) / 2 + left;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return right;
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
 比较特殊的二分查找

 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
