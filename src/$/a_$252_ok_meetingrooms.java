package $;

import array.Interval;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// 第一次就一遍过
// 30 - 43 13minutes
public class a_$252_ok_meetingrooms {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};

    }
    public static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (Interval e1, Interval e2)->e1.start - e2.start);
        if (intervals.length == 0) return true;

        int end = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < end) return false;
            else end = intervals[i].end;
        }
        return true;
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

 TODO follow
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */