package companys.pocketGems;

/**
 * Created by yuboyang on 7/5/17.
 */
public class Strstr_lc28 {


    /*
    time complexity : O (m * n)   (O(两个字符串长度相乘))

    case:
    aaabb
    abb
    cur:   aaa, aab, abb



    worst case并举例就是aaaaaaaaa和aaaab的例子
    follow up ：有啥更好的方法没？ 答曰：KMP。 赞曰：OK，good。就没了。
     */

    public static void main(String[] args) {
        System.out.println(strStr("aabb", "ab"));
        System.out.println(strStr("aabb", ""));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            String cur = haystack.substring(i, i + needle.length());
            if (cur.equals(needle)) return i;
        }
        return -1;
    }

    // better way
    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // kmp (m + n)

}
