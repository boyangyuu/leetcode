package hashTable;

import java.util.*;

public class hs_49_ok_GroupAnagrams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] tempC = strs[i].toCharArray();
            Arrays.sort(tempC);
            String temp = new String(tempC);
            if (map.containsKey(temp)) {
                int index = map.get(temp);
                ret.get(index).add(strs[i]);
            } else {
                map.put(temp, ret.size());
                List<String> newList = new ArrayList();
                newList.add(strs[i]);
                ret.add(ret.size(), newList);  // todo bug1 等效于 ret.add(newList);
            }
        }

        return ret;
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

 1. map key : List的index , value: 排序后的唯一string
 2. 遍历
    将元素排序
 switch{
    map中 存在 ret[key].add
    map中 不存在 ...
 }

 TODO case

 TODO bug

 bug1
    ret.add(ret.size(), newList);
    ret.add(newList);
 bug2

 bug3
 */

/*
TODO tutorial


 */
