package hankerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by yuboyang on 6/25/17.
 */
public class common {
    public static void main(String[] args) {
        System.out.println(prison(3,3,new int[]{2},new int[] {2}));
        System.out.println(prison(3,2,new int[]{1,2,3},new int[]{1,2}));

        System.out.println(prison(3,2,new int[]{2},new int[]{1,2}));
    }



    static long prison(int n, int m, int[] h, int[] v) {
        Set<Integer> seth = new HashSet<>();
        for (int i = 0; i <= n + 1; i++)
            seth.add(i);

        for (int i : h) seth.remove(i);

        Set<Integer> setv = new HashSet<>();
        for (int i = 0; i <= m + 1; i++)
            setv.add(i);
        for (int i : v) setv.remove(i);

        int maxh = 1;
        Iterator<Integer> it = seth.iterator();
        int prev = it.next();
        while (it.hasNext()) {
            int cur = it.next();
            maxh = Math.max(maxh, cur - prev);
            prev = cur;
        }

        int maxv = 1;
        it = setv.iterator();
        prev = it.next();
        while (it.hasNext()) {
            int cur = it.next();
            maxv = Math.max(maxv, cur - prev);
            prev = cur;
        }
        System.out.println(maxh + ", " + maxv);
        return maxh * maxv;
    }
}