package array;
import java.util.*;


public class a_56_MergeIntervals {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
    }

    public List<Interval> merge(List<Interval> intervals)
    {
        List<Interval> toRet = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0)
            return toRet;

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        Interval prev = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++)
        {
            Interval curr = intervals.get(i);
            if(prev.end >= curr.start)
                prev.end = curr.end > prev.end? curr.end: prev.end;
            else
            {
                Interval t = new Interval(prev.start, prev.end);
                //System.out.println(t.start + ":" + t.end);
                toRet.add(t);
                prev = curr;
            }
        }
        toRet.add(new Interval(prev.start, prev.end));
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