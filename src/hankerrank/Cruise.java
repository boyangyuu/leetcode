package hankerrank;

import java.util.*;

/**
 * Created by yuboyang on 8/12/17.
 */
public class Cruise {
    public static void main(String[] args) {
//        System.out.println("1");
//        System.out.println(electionWinner(new String[]{"victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" }));
//        System.out.println(electionWinner(new String[]{"victor" }));
//        System.out.println(maxDifference(new int[]{0}));
//        System.out.println(maxDifference(new int[]{0, 1}));
//        System.out.println(maxDifference(new int[]{0, -1}));
        System.out.println(countX(new String[]{"1 2", "3 2", "3 2"}));
        /*


         */

    }


    static String electionWinner(String[] votes) {
//        String[] votes = { "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };
        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                .getKey());
        return (Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                .getKey());
    }




    static long countX(String[] steps) {
        long minR = -1;
        long minC = -1;
        for (int i = 0; i < steps.length; i++) {
            String cur = steps[i];
            int index = cur.indexOf(" ");
            long r = Long.parseLong(cur.substring(0, index));
            long c = Long.parseLong(cur.substring(index + 1));
            if (i == 0) {
                minR = r;
                minC = c;
            } else {
                minR = Math.min(minR, r);
                minC = Math.min(minC, c);
            }
        }
        return minC * minR;
    }

    static int maxDifference1(int[] a) {
        int[] minDp = new int[a.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            minDp[i] = min;
        }

        int ans = -1;
        for (int i = a.length - 1; i >= 1; i--) {
            ans = Math.max(ans, a[i] - minDp[i - 1]);
        }
        return ans <= 0 ? -1 : ans;
    }

    static int maxDifference(int[] a) {
//        int[] minDp = new int[a.length];
        int min = a[0];
        int ans = -1;
        for (int i = 1; i < a.length; i++) {
            ans = Math.max(ans, a[i] - min);
            min = Math.min(min, a[i]);
        }
        return ans <= 0 ? -1 : ans;
    }

    /*
    SELECT D.NAME, count(E.ID) as employeeCount
FROM employee E
RIGHT JOIN DEPARTMENT D ON D.DEPT_ID=E.DEPT_ID
GROUP BY D.NAME
ORDER BY employeeCount DESC, D.NAME


     */

}
