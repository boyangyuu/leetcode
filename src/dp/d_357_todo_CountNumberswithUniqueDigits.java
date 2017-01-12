package dp;

public class d_357_todo_CountNumberswithUniqueDigits {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }


    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 10;
        int base = 9;
        for (int i = 2; i < n + 1 && i <= 10; i++) {
            base = base * (10 - i + 1);
            dp[i] = base + dp[i - 1]; // two digit number (10-99): 9 * 9 + 1 digit number : 10 =
        }
        return n >= 10 ? dp[10] : dp[n];
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
 This is a digit combination problem. Can be solved in at most 10 loops.

 When n == 0, return 1. I got this answer from the test case. // todo

 When n == 1, _ can put 10 digit in the only position. [0, ... , 10]. Answer is 10.

 When n == 2, _ _ first digit has 9 choices [1, ..., 9], second one has 9 choices excluding the already chosen one. So totally 9 * 9 = 81. answer should be 10 + 81 = 91

 When n == 3, _ _ _ total choice is 9 * 9 * 8 = 684. answer is 10 + 81 + 648 = 739

 When n == 4, _ _ _ _ total choice is 9 * 9 * 8 * 7.

 ...

 When n == 10, _ _ _ _ _ _ _ _ _ _ total choice is 9 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

 When n == 11, _ _ _ _ _ _ _ _ _ _ _ total choice is 9 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 * 0 = 0


 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */
