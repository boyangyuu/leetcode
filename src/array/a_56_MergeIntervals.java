package array;
import java.util.*;


public class a_56_MergeIntervals {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<a_56_Interval> merge(List<a_56_Interval> intervals)
    {
        List<a_56_Interval> toRet = new ArrayList<a_56_Interval>();
        if(intervals == null || intervals.size() == 0)
            return toRet;

        Collections.sort(intervals, new Comparator<a_56_Interval>(){
            @Override
            public int compare(a_56_Interval i1, a_56_Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        a_56_Interval prev = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++)
        {
            a_56_Interval curr = intervals.get(i);
            if(prev.end >= curr.start)
                prev.end = curr.end > prev.end? curr.end: prev.end;
            else
            {
                a_56_Interval t = new a_56_Interval(prev.start, prev.end);
                //System.out.println(t.start + ":" + t.end);
                toRet.add(t);
                prev = curr;
            }
        }
        toRet.add(new a_56_Interval(prev.start, prev.end));
        return toRet;
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

 思路 :
 之后

 集合的排序算法!!!

 Collections.sort(intervals, new Comparator<a_56_Interval>(){
@Override
public int compare(a_56_Interval i1, a_56_Interval i2)
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