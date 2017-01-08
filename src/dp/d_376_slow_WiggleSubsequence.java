package dp;

import java.util.ArrayList;
import java.util.List;

// todo learn other solutions ()
public class d_376_slow_WiggleSubsequence {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        // todo case {1,1,1,2,3}, {1,1,1,1}
    }

    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) return nums.length;
        List<Integer> res = new ArrayList<>();
        int flag = 2;
        int j = 1;
        while (j < nums.length) {
            if (nums[j - 1] != nums[j]) {
                flag = nums[j - 1] < nums[j] ? 1 : -1;
                break;
            }
            j++;
        }
        if (flag == 2) return 1;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] - tmp) * flag > 0) {
                res.add(tmp);
                flag = -1 * flag;
                tmp = nums[i];
            }
            else tmp = nums[i];
        }
        res.add(tmp);
        return res.size();
    }

    // dp
    /*
    dp_up[i]  => ends with i , if the result's last element's wiggle direction is up, the max length (以i元素结尾的wiggle list, 其长度)
    dp_down[i] => ..
    dp_up = {
        if (nums[i] > nums[i - 1]) up[i] = down[i - 1] + 1
        else up[i] = up[i - 1] // 结尾元素换为nums[i]
    }



     */
    public int wiggleMaxLength2(int[] nums) {

        if( nums.length == 0 ) return 0;

        int[] up = new int[nums.length];
        int[] down = new int[nums.length];

        up[0] = 1;
        down[0] = 1;

        for(int i = 1 ; i < nums.length; i++){
            if( nums[i] > nums[i-1] ){
                up[i] = down[i-1]+1;
                down[i] = down[i-1];
            }else if( nums[i] < nums[i-1]){
                down[i] = up[i-1]+1;
                up[i] = up[i-1];
            }else{
                down[i] = down[i-1];
                up[i] = up[i-1];
            }
        }

        return Math.max(down[nums.length-1],up[nums.length-1]);
    }

    // advanced dp
    public int wiggleMaxLength4(int[] nums) {

        if( nums.length == 0 ) return 0;

        int up = 1,down = 1;

        for(int i = 1 ; i < nums.length; i++){
            if( nums[i] > nums[i-1] ) {
                up = down + 1;
            } else if( nums[i] < nums[i-1]){
                down = up + 1;
            } else{
            }
        }

        return Math.max(down,up);
    }
    // second solution remove elements  1,2,3,4 => 1,4




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
 step1 solution introduction
 1. greedy
 2. how to be greedy , choose as many as we can , for example , the nums[0] should choose or not todo! discuss...., then we can confirm the greedy really work
 3. the main code

 4. corner case , consecutive duplicate (todo learn consecutive)
 5. code





 Let's imagine the given array is [1,2,10,1] , we will choose 1,10,1 , 10 is better than 2 cuz if we choose 10, we have have
 more choices to choose the smaller elements (9,8,etc)
 let's check the questions, I think the wiggle direction is not defined beforehand, so we should maintain one ,

 and we use temp variable



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

/*
TODO tutorial
 dp指代 , 一共分2种情况
  1、dp[n]代表着最优解解 和
  2、max{dp[1],,,dp[n]} 为最优解 其中dp[i] 代表着end with x[i] 时的解

 dp解空间, 大概也分2种
  1、 dp = max{dp[n-1], dp[n-2]}
  2、 dp = max {
        dp[j1]
        dp[j2]    // under some condition
        ....
  }

 */
