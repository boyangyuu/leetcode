package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_299_ok_BullsandCows {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }
        // set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){}
    }

    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        int sumCnt = 0, bullCnt = 0;
        for (int i = 0; i < secret.length(); i++) {
            char cur = secret.charAt(i);
            if (secret.charAt(i) == guess.charAt(i)) bullCnt++;
            //generate map
            if (map.containsKey(cur)) {
                int v = map.get(cur).intValue();
                map.put(cur, v + 1);
            } else {
                map.put(cur, 1);
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            char cur = guess.charAt(i);
            if (map.containsKey(cur) && map.get(cur).intValue() > 0) {
                sumCnt++;
                int v = map.get(cur).intValue();
                map.put(cur, v - 1);
            }
        }

        return bullCnt + "A" + (sumCnt - bullCnt) + "B";
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
    HashMap map: key= digit value= counts
    int sumCnt : bulls and cows
    int bullCnt :
    int cowCnt = s - b
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
