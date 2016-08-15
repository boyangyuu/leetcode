package array;

import java.util.ArrayList;

public class a_45_jumpGame2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static int jump(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 0;
        int l = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 1; i < nums.length; i++) {
            //limit
            if (list.size() == 1) {
                list.add(i);
                continue;
            }

            // check to delete object in list
            int check = list.get(list.size() - 2);
            if (nums[l - i] < i - check) { //bug
                list.add(i);
            } else {
                list.remove(list.size() - 1);
                i--; // bug1
            }

        }
        return list.size() - 1;
    }


    public static int jump1(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 0;
        int ret = 0;
        int i = nums.length - 1; // 1
        while(true) {
            int temp = i - 1;
            for(int j = i - 1; j >= 0; j--){
                if (nums[j] >= i - j){ //bug1
                    temp = j;
                }
            }
            i = temp;
            ret++;
            System.out.println("i:" + i);
            if (i == 0) break;
        }
        return ret;
    }

}
/** 题
 *
 * http:https://leetcode.com/problems/jump-game-ii/
 *
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 方法1 O(n²)
倒数, 每次寻找倒数第一个jump点
 以此jump 继续找

gg exceed Time

方法2


 方法2 入站
 7,5,2,3,1,1,4
 {index}

 nums[l - index] < index(该元素位置) - 倒数第二元素(上上一个jump点位置) 则入战 否则递归删除,  当 栈大小为1 入栈
 {0, 1} 倒数第二个作为起点 开始
 {0, 1} => {0, 1, 2}  倒数i = 2 尝试替换 末尾元素, 与 末尾之前元素 进行比较 nums[l - 2] < 2 - 0 替换失败 入站
 {0,1,2} => {0,3}     nums[l - 3] >  3 - 1 删, {0,1}  nums[l-3] >= 3-0 删, 大小为1 入
 .....
 index = 0 退出







 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */