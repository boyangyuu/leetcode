package companys.IXL;

/**
 * Created by yuboyang on 7/26/17.
 */
public class IXLOA {
    public static void main(String[] args) {
//        System.out.println(countHoles(1288));
//        System.out.println(getMinimumDifferenceInTwoWords("ab", "ba"));

//        System.out.println(help("1/2+3/4"));

        System.out.println(countX(new String[]{"2 3", "3 7", "4 1"}));
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


    static String[] reducedFractionSums(String[] expressions) {
        String[] res = new String[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            res[i] = help(expressions[i]);
        }
        return res;
    }

    static String help(String expression) {
        // get a1, b1
        int index = expression.indexOf("+");
        String s1 = expression.substring(0, index);
        String s2 = expression.substring(index + 1);
        index = s1.indexOf("/");
        int a = Integer.parseInt(s1.substring(0, index));
        int b = Integer.parseInt(s1.substring(index + 1));
        index = s2.indexOf("/");
        int c = Integer.parseInt(s2.substring(0, index));
        int d = Integer.parseInt(s2.substring(index + 1));
        int a1 = a * d + b * c;
        int b1 = b * d;
        System.out.println(a1 + "/" + b1);
        // divide
        int factor = getCommonFactor(a1, b1);
        b1 /= factor;
        a1 /= factor;
        return a1 + "/" + b1;

    }

    static int getCommonFactor(int a, int b) {
        int res = Math.min(a, b);
        while (res > 1) {
            if (a % res == 0 && b % res == 0) return res;
            else res--;
        }
        return 1;
    }

/*

    static int[] getMinimumDifference(String[] a, String[] b) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = getMinimumDifferenceInTwoWords(a[i], b[i]);
        }
        return res;
    }

    static int getMinimumDifferenceInTwoWords(String a, String b) {
        if (a == null || b == null) return -1;
        if (a.length() != b.length()) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        for (char c : b.toCharArray()) {
            if (!map.containsKey(c)) res++;
            else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) map.remove(c);
            }

        }
        return res;
    }

    static int countHoles(int num) {
        if (num == 0) return 1;
        int res = 0;
        while (num != 0) {
            int cur = num % 10;
            num /= 10;
            System.out.println("cur:" + cur + "num:" + num);
            if (cur == 8) res += 2;
            else if (cur == 0 || cur == 4 || cur == 6 || cur == 9) res += 1;
        }
        return res;
    }
*/

}
