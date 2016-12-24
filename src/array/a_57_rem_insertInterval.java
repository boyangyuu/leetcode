package array;

import java.lang.reflect.Array;
import java.util.*;


// todo 强记最好的思路 , 绝壁别用自己想的, best: 插入元素进数组, 再合并 (考虑 case 情况)
public class a_57_rem_insertInterval {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List<Interval> list = new ArrayList<>();
//        list.add(new Interval(1,2));list.add(new Interval(3,5));list.add(new Interval(6,7));
//        list.add(new Interval(8,10));list.add(new Interval(12,16));
//        System.out.println(insert1(list, new Interval(4, 9)));
//
//        // todo bug case 1
//        list.clear();list.add(new Interval(1,2));
//        System.out.println(insert1(list, new Interval(2,3)));

        // todo bug case 2  [[1,5]] [0,0]
        list.clear();list.add(new Interval(1,5));
        System.out.println(insert1(list, new Interval(0,0)));

        // todo bug case 3  [[1,5]] [2,6]
    }

    // best solution
    public static List<Interval> insert1(List<Interval> intervals, Interval newInterval) {
        // step 1 insert
        int index = 0;
        for (index = 0; index < intervals.size(); index++)
            if (newInterval.start < intervals.get(index).start) break;
        intervals.add(index, newInterval);
//        intervals.add(newInterval);
//        intervals.sort((e1, e2)-> e1.start - e2.start); // todo sort 也可以
//        System.out.println(intervals);

        // step 2 merge
        List<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval cur = intervals.get(i);
            Interval last = res.get(res.size() - 1);
            if (cur.start <= last.end)
                last.end = Math.max(last.end, cur.end);
            else
                res.add(cur);
        }

        return res;
    }

    // bad solution 直接合并插入, 特别费事
    public static List<Interval> insert2(List<Interval> intervals, Interval newInterval) {
        if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        List<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));

        boolean b = false; // already inserted or not
        for (int i = 1; i < intervals.size(); i++) {
            Interval last = res.get(res.size() - 1);
            Interval cur = b ? intervals.get(i) : newInterval;
            if (cur.end > last.start) {

            }
            else if (cur.start <= last.end) {
                last.start = Math.min(cur.start, last.start);
                last.end = Math.max(cur.end, last.end);
                b = true;
            } else res.add(intervals.get(i));
        }

        if (b == false) {
            Interval last = res.get(res.size() - 1);
            if (newInterval.start <= last.end) {
                last.start = Math.min(last.start, newInterval.start);
                last.end = Math.max(last.end, newInterval.end);
            } else if (newInterval.end > last.start) {

            }
            else {
                res.add(newInterval);
            }
        }

        // fail
        return res;
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