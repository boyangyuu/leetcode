package hankerrank;

import java.util.*;

/**
 * Created by yuboyang on 7/17/17.
 */
public class Shutterstock {
//    static float[] predictMissingHumidity(String startDate, String endDate, String[] knownTimestamps, float[] humidity, String[] timestamps) {
//
//
//    }



    public static void main(String[] args) {
        System.out.println(packetDescrambler(new int[]{1, 1, 0, 0, 0, 2, 2, 2},
                new char[]{'+','+', 'A', 'A', 'B', '#', '#', '#'},
                3));


    }
public static  String packetDescrambler(int[] seq, char[] fragmentData, int n) {
    Map<Character, Integer> map = new HashMap<>();
    String res = "";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < seq.length; j++) {
            if (seq[j] == i) {
                map.put(fragmentData[j], map.getOrDefault(fragmentData[j], 0) + 1);
            }
        }
        if (map.size() == 0) return "";

        // 0.50
        char cur = ' ';
        for (Character key : map.keySet()) {
            if (map.get(key) > map.keySet().size() / 2) cur = key;
        }
        System.out.println("i: " + i);
        System.out.println("c: " + cur);
        if (cur == ' ') return "";
        res += cur;
    }

    if (res.indexOf('#') != res.length() - 1) return "";
    return res;
}

}
