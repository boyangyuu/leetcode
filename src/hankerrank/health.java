package hankerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuboyang on 6/25/17.
 */
public class health {
    public static void main(String[] args) {
//        System.out.println(beautifulSubarrays(new int[]{2,5,4,9}, 2));
        System.out.println(help(1,4,5,9));
        System.out.println(help(1,2,2,1));
    }



    static Set<String> set = new HashSet<>();
    static String canReach(int x1, int y1, int x2, int y2) {
        return help(x1, y1, x2, y2) ? "YES" : "NO";
    }

    static boolean help(int x1, int y1, int x2, int y2) {
        String str = x1 + "_" + y1;
        if (x1 == x2 && y1 == y2) return true;
        if (set.contains(str)) return false;
        boolean res = false;
        if ( (x2 - x1) * y1 > 0 ) {
            res |= help(x1 + y1, y1, x2, y2);
        }
        if ( (y2 - y1) * x1 > 0) {
            res |= help(x1, y1 + x1, x2, y2);
        }
        return res;
    }

    /*
    case 2,5,4,9
    i   0, 1, 2            3
    sum 0, 1, 1            2
    res 0, 0, 0            1
    map 0=>1, 0=>1, 1=>1, 0=>2,1=>1;


     */
    static long beautifulSubarrays(int[] a, int m) {
        HashMap<Integer, Integer> map = new HashMap<>(); // key sum; value count of odds so far
        int sumOdds = 0;
        long res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) sumOdds++;

            int need = sumOdds - m;
            if (need == 0) res += 1;
            if (map.containsKey(need)) {
//                System.out.println("need : " + need);
                res += map.get(need);
            }
            map.put(sumOdds, map.getOrDefault(sumOdds, 0) + 1);
        }
        return res;
    }

}