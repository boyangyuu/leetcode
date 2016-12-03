package $;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


// todo 尝试 o（n) 方法
public class a_$277_todo_FindtheCelebrity {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        List list;Map map;
    }

    public int findCelebrity(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        int res = 0;
        while(list.size() != 1) {
            for (int i = 1; i < list.size(); i++) {
                int cur = list.get(i);
                if (knows(res, cur)) {
                    list.remove(0);
                    res = list.get(0);
                }
                else list.remove(i);
            }
        }
        for (int i = 0; i < n; i++) if (res != i && knows(res, i)) return -1;
        return res;
    }

    boolean knows(int a, int b){
        return a < b;
    }

    // best solution O(n)  假设0为名人, 判断i 名人认识i的话,则名人更改;否则 i不是名人,略过即可
    int findCelebrity1(int n) {
        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (knows(res, i)) res = i;
        }
        for (int i = 0; i < n; ++i) {
            if (res != i && (knows(res, i) || !knows(i, res))) return -1;
        }
        return res;
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