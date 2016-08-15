package array;

import java.util.*;

public class a_57_insertInterval {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {


        //insert
        int checkIndex = 0;
        for (int i = 0; i < intervals.size(); i++) {
            Interval v = intervals.get(i);

            if (i == 0 && newInterval.end <= v.start){
                intervals.add(i, newInterval);
                checkIndex = i;
                break;
            }
            if (v.start <= newInterval.start){
                intervals.add(i + 1, newInterval);
                checkIndex = i;
                break;
            }
        }

        //merge
        mergeIntervals(checkIndex, intervals);

        return intervals;
    }

    public static void mergeIntervals(int index, List<Interval> intervals){
        while(true){
            if (index <= intervals.size() - 1) return;
            Interval curr = intervals.get(index);
            Interval next = intervals.get(index + 1);
            if (next.start <= curr.end){
                next.start = curr.start;
                next.end = Math.max(curr.end, next.end);
                intervals.remove(index);
            } else {
                index++;
            }

        }

    }

}
/** 题
 *
 * http:
 *
 Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

 You may assume that the intervals were initially sorted according to their start times.

 Example 1:
 Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

 Example 2:
 Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

 This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :


 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */