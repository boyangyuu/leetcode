package companys.pocketGems;

/**
 * Created by yuboyang on 7/16/17.
 * http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=168365&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D39%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311
 * 第二轮电面
 也是地里出现过的题
 1. input 一个array A一个数x，找出A里边的一个index k使a1 = A[0~k-1]里边等于x的元素个数 等于 a2=A[k ~ n-1]里不等于x的元素的个数，如果
 没有符合的返回-1。注意a1和a2不能为空，也就是0和n-1都不符合要求。
 好找。扫一遍数出一共x多少个xTotal。再扫一遍，边扫边数出已经遇到的x个数xMet。这样在每个index都能随时直接算出a2里不等于x的元素的个数了。
 -google 1point3acres
 然后让人工过一个test case。
 follow up ：可不可能有多个符合的index.。答曰：不能。追问：请证。
 之前没看见有人报这个followup，一开始虽然直觉觉得不能，但是还是没想清楚，只想到在第二遍扫的时候有四个相关的变量：xMet，nonXMet, xNotMet,
 nonXNotMet。其中xMet和nonXMet组成了扫过的部分，xNotMet和nonXNotMet组成了未扫过的部分。符合的条件则是：xMet = nonXNotMet。而这两个变量
 一个只能递增(xMet)，一个只能递减(nonXNotMet)，而且并不能同时不变，因为如果当前index值是x，index++之后xMet也+1；如果当前的index值不是x，
 index++之后nonXNotMet就-1。所以不能同时不变，就不能有多个符合的。
 */

public class findI_电2 {

    // folow up could have duplicate index or not => no,
    int findIndex(int[] arr, int k) {
        int num = 0;
        for (int i : arr) if (k == i) num++;

        int curNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == i) curNum++;
            int curNumRight = num - curNum;
            if (curNum == arr.length - i - curNumRight) return i + 1;
        }
        return -1;
    }


}
