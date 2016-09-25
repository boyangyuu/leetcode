package array;
import java.util.*;


public class a_56_MergeIntervals {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<Interval> merge(List<Interval> intervals)
    {
        List<Interval> res = new ArrayList<Interval>();
        if(intervals.size() == 0)  return res;

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        res.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++)
        {
            Interval curr = intervals.get(i);
            Interval prev = res.get(res.size()-1);
            if(prev.end >= curr.start)
                prev.end = curr.end > prev.end? curr.end: prev.end;
            else
                res.add(curr);
        }
        return res;
    }

}
/** 题
 *
 * http:
 *
 Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].

 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站

 思路 :
 {
    List res : 结果
    Interval prev : 当前res末尾元素
    Interval cur  : res[i] , 与prev 合并
 }

 集合的排序算法!!!

 Collections.sort(intervals, new Comparator<Interval>(){
@Override
public int compare(Interval i1, Interval i2)
{
return i1.start - i2.start;
}
});

 步骤1
 步骤2
 步骤3

 bug1
 bug2
 bug3
 */