package $;

import array.Interval;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

// todo no idea and need to learn heap.peek()

public class a_$253_noidea_meetingrooms2 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};

    }

    public static int minMeetingRooms(Interval[] intervals) {
        Arrays.sort(intervals, (e1, e2)->e1.start - e2.start);
        PriorityQueue<Interval> queue = new PriorityQueue<>((e1, e2) -> e1.end - e2.end);
        for (Interval i : intervals) {
            if (queue.size() == 0) queue.add(i);
            else {
                if (queue.peek().end <= i.start) {
                    // queue.peek().end = i,end todo wrong way!
                    queue.poll(); // todo queue.peek() 是不会对堆进行排序和整理的, 只有pop才会
                    queue.add(i);
                }
                else queue.add(i);
            }
        }
        return queue.size();
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
 [[0, 30],[5, 10],[15, 20]],

 主要思想, 排序之后 尽量合并, 其中合并的技巧:
 head<Inteval>  维持房间 (start -- end)

 30, 10 试图合并 下一个元素 (15,20) 的时候, end值越低 的越可以合并, (不用找最接近的, 因为接近是没有必要的)
 假如无法合并, 则需要新开房间, 即
 而且一旦合并后, start 失去了意义, 5,10 合并15,20 (5 15 这连个start没有意义, 15没有意义, todo 所以本题heap 实际只需要放入end即可)


 再来一看一种使用最小堆来解题的方法，这种方法先把所有的时间区间按照起始时间排序，然后新建一个最小堆，开始遍历时间区间，
 如果堆不为空，且首元素小于等于当前区间的起始时间，我们去掉堆中的首元素，把当前区间的结束时间压入堆，由于最小堆是小的在前面，
 那么假如首元素小于等于起始时间，说明上一个会议已经结束，可以用该会议室开始下一个会议了，所以不用分配新的会议室，
 遍历完成后堆中元素的个数即为需要的会议室的


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