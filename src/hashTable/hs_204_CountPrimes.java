package hashTable;

import java.util.HashSet;

public class hs_204_CountPrimes {
    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        int index = 1;
        while(++index < n) { // todo bug1
            boolean flag = true;
            for (int i : set){
                if (i * i <= index && index % i == 0) {  //todo bug3
                    flag = false; // todo bug2
                    break;
                }
            }
            if (flag) {
                set.add(index);
                cnt++;
            }

        }

        return cnt;
    }

    public int countPrimes1(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
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
 {
    Set set : 存 prime (质数)

 }

 TODO case

 TODO bug

 bug1
 while(++index < n) { // todo bug1
 while(++index <= n) { // 题干less than

 bug2
 if (index % i == 0) continue; // todo bug2
 if (index % i == 0) flag = false; // todo bug2

 bug3
 */

/*
TODO tutorial


 */
