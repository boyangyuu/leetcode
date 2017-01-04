package brain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// todo remember 即可 , true true true 之后 必为false, 只要前三个有false, 则 可以true 那么 后面又可以连续三个true
//  t t t f t t t f。。。。

public class dp_$292_rem_NimGame {
    public static void main(String[] args) {
        List list = new ArrayList();Map map;Set set;
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(5));
        System.out.println(canWinNim(6));
        System.out.println(canWinNim(7));

    }

    //best s , this question is brain teaser,
    public static boolean canWinNim1(int n) {
        return n % 4 != 0;
    }

    // s2
    public static boolean canWinNim(int n) {
        if (n <= 3) return true;
        boolean b1 = true;boolean b2 = true;boolean b3 = true;
        for (int i = 4; i <= n; i++) {
            boolean t_b3 = b3; // todo bug
            b3 = (!b1) || (!b2) || (!b3);
            b1 = b2;
            b2 = t_b3;
        }
        return b3;
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




