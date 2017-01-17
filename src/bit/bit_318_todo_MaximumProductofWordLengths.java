package bit;

public class bit_318_todo_MaximumProductofWordLengths {
    /*
        the time cost is major in comparison between 2 string, to solve it we can use bit mask instead of just compare characters one by one
    then if two masks of str AND is not zero, that will prove the 2 str is not ok to make product

    */

    public int maxProduct(String[] words) {
        int[] masks = new int[words.length];
        for (int i = 0; i < masks.length; i++) {
            String word = words[i];
            for (char c : word.toCharArray()) masks[i] |= (1 << (c - 'a')); // todo learn how to foreachly set bit value by todo using |=
        }

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((masks[i] & masks[j]) == 0) res = Math.max(res, words[i].length() * words[j].length());
            }
        }

        return res;
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


 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial
 异或 1 ^ 0 = 1　　假^真=真　　假^假=假　　真^真=假 (相同即为0 不同为1)
 与   1 & 1 = 1                                 (只有1&1 才为1)
 非   0 | 0 = 0 , 0 | 1 = 1, 1 | 0 = 1, 1 | 1 = 1 (只有0|0 才为0)
 >>i  右移i位          //1101 >> 2 = 11
 x>>i & 1 取 x的第i+1位的值(1 or 0) // 箭头方向为移动方向
 */
