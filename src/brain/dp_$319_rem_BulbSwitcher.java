package brain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo remember 即可 , true true true 之后 必为false, 只要前三个有false, 则 可以true 那么 后面又可以连续三个true
//  t t t f t t t f。。。。

public class dp_$319_rem_BulbSwitcher {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;


    }


    public int bulbSwitch(int n) {
        int res = 0, i = 1;
        while(i * i <= n) {
            res++;
            i++;
        }
        return res;
    }
}

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站
 TODO translation


 TODO solotion
 ######s1######
 todo 题意 there are n nums, after n round , which is on
 it means =>  which num is toggled by odd times
 for example
 number 15 => round 1,3,5,15 will be toggle, even times, so off
 number 16 => round 1,16, 2,8, 4,4 will be toggle it is odd times cuz 4(4 only happen once)
 so just need count how many n1*n1 <= n (perfect square)



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
 bug1
 //
 =>
 if (res) return res; // todo bug 不写的话超时 case "++++++++++++"

 bug2
 bug3
 */




