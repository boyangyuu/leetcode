package array;

import java.lang.reflect.Array;
import java.util.*;

public class a_57_insertInterval {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>(intervals);
        int i = 0, overlap = 0, n = res.size();
        while (i < n) {
            Interval cur = res.get(i);
            if (newInterval.end < cur.start) break;
            else if (newInterval.start > cur.end) {}
            else {
                newInterval.start = Math.min(newInterval.start, cur.start);
                newInterval.end = Math.max(newInterval.end, cur.end);
                ++overlap;
            }
            ++i;
        }

        int from = i - overlap;  // the first inserted index
        for (int j = 0; j < overlap; j++) {
            res.remove(from);
        }
        res.add(from, newInterval);
        return res;
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

todo solution
    新插对象无论如何都会被插入
  能插的位置都插,, 最后删掉 overlap个 被插的, 插入新插对象
  注意 不要改旧数值

 step 1. {
    int overlap = 0 // 重复区间 遇到重复区间则加1
    int i = 0 ;    // 维持到最后一个可以插入的位置
    int from = i - overlap; // 第一个插入的位置
    newInterval ; // 维护, 使其被插入, 直到最大化
    if 新区间末尾 小于 intervals[0]的开头 则无法插入 跳出循环
    elseif 新区间开头 大于 intervals[i] 的末尾 循环继续
    else 插入 , overlap ++;

    删除所有的overlap区间, 添加 维护后的newInterval

 }

 step 2. {

 }

todo bug
 bug1
 bug2
 bug3
 */