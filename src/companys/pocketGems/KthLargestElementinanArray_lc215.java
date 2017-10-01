package companys.pocketGems;

import java.util.List;

/**
 * Created by yuboyang on 7/5/17.
 */
public class KthLargestElementinanArray_lc215 {
    /*
2. ktop也还行吧，只是我不知死活的问了一句如果有频率一样的怎么办，让都输出来。比如A = [2, 3, 5, 3, 2, 5, 1, 5, 6], k = 2，最多的是5有3次，
其次是2和3各有两次，这样k=2就输出[5, 2, 3]顺序不重要。楼主发现之前想的瞬间不对了，于是灵机一动想了个解决方法。俩hashmap + minheap。
先扫一遍用一个hashmap<Integer, Integer>计数，上面的例子就是：[2:2, 3:2, 5:3, 1:1, 6:1]。然后把第一个hashmap里边的信息放第二个
hashmap<Integer, Set<Integer>>里，key是频率，set里是所有出现这个频率的数，比如：[2:<2, 3>, 3:<5>, 1:<1, 6>]。然后再把第二个hashmap
里的entry扔到size = 2的minheap里，剩下的再慢慢输出。
也让写了主函数测试，出现了几个没compile过的，改了改，过了。问了复杂度O(nlogk)，解释了半天第二个hashmap干啥用的。并没有stream的那个followup。

     */

    public List<Integer> topKFrequent(int[] nums, int k) {
        return null;
    }

}
