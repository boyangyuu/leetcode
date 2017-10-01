package companys.audible.onsite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuboyang on 7/15/17.
 * 比如第一个数组{8,2,5,7,4,3} 第二个数组{2,8,7,5}，输出结果为{8,2,5,7}。
 */
public class SortArray__1 {

    public static void main(String[] args) {
        int[] arr = {2,8,7,5};
        int[] dict = {8,2,5,7,4,3};
        sortArrayByDictionary(arr, dict);
        System.out.println(Arrays.toString(arr));
    }

    /*
    dict 8,2,5,7,4,3
    arr : 2,8,7,5
    map : 2,8,7,5
    output:  8, 2, 5, 7,

    */

    public static void sortArrayByDictionary(int[] arr, int[] dic) {
        Map<Integer, Integer> map = new HashMap<>(); // value : count times
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        int index = 0;
        for (int i : dic) {
            if (map.containsKey(i)) {
                for (int j = 0; j < map.get(i); j++)
                    arr[index++] = i;
                map.remove(i);
            }
        }

    }

}
