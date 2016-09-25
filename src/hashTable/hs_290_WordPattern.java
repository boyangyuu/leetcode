package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class hs_290_WordPattern {
    public static void main(String[] args) {
        //map 用法
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int key : map.keySet()) {
            map.get(key);
        }
        // set 用法
        HashSet<Integer> set = new HashSet<>();
        for (int v : set){

        }

    }

    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if (strs.length != pattern.length()) return false; //todo bug1
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if(map.containsKey(strs[i])){
                char v = map.get(strs[i]);
                if (v != pattern.charAt(i)) return false;
            }
            else {
                char v = pattern.charAt(i);
                if (map.containsValue(v)) return false;
                map.put(strs[i], pattern.charAt(i));
            }
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

 给strs
 {
    String[] strs : words
    map map : key=> word v:pattern
    if (存在word) pattern 必须一致
    else
    {
        if(存在pattern) return false
        else 添加 word,pattern
    }

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
