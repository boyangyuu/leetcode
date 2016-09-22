package hashTable;

import java.util.HashSet;

public class hs_204_CountPrimes {
    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        int index = 1;
        while(++index <= n) {
            for (int i : set){
                if (index % i == 0) {
                    continue;
                }
            }
            set.add(index);
            cnt++;
        }

        return cnt;
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
 {
    Set set : 存 prime (质数)

 }

 TODO case

 TODO bug

 bug1


 bug2

 bug3
 */

/*
TODO tutorial


 */
