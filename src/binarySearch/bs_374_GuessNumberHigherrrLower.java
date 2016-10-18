package binarySearch;


public class bs_374_GuessNumberHigherrrLower {
    public static void main(String[] args) {


    }

    public int guess(int num) {
        return 1;// -1 1 0
    }

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int v = guess(mid);
            if (v == 0) return mid;
            else if (v == 1) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
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
