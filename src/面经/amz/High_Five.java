package 面经.amz;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;

import java.util.*;

/**
 * Created by yuboyang on 2/21/17.
 */

/*
写好了一个叫Result的类，中文翻译成节点，题目是输入是一堆节点，节点里面有两个属性学生id和分数，
保证每个学生至少会有5个分数，求每个人最高的5个分数的平均分。返回的是Map<Integer, Double>, key是id，
value是每个人最高5个分数的平均分double是平均分。感觉就是一堆考卷登记成绩单，但为啥就挑5个呢，
等遇到这题让亚马逊给出合乎逻辑的解释。

get top5 average score of every id,
 */
class Result {
    int id;
    int value;
    public Result (int id, int value) {
        this.id = id;
        this.value = value;
    }
}

public class High_Five {
    public static void main(String[] args) {
        Result r1 = new Result(1, 95);
        Result r2 = new Result(1, 95);
        Result r3 = new Result(1, 91);
        Result r4 = new Result(1, 91);
        Result r5 = new Result(1, 93);
        Result r6 = new Result(1, 105);

        Result r7 = new Result(2, 6);
        Result r8 = new Result(2, 6);
        Result r9 = new Result(2, 7);
        Result r10 = new Result(2, 6);
        Result r11 = new Result(2, 6);
        Result[] arr = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        Map<Integer, Double> res = getHighFive(arr);

        System.out.println(res.get(1) + " " +res.get(2));
    }

    public static Map<Integer, Double> getHighFive(Result[] results){
        // step 1  key->results
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < results.length; i++) {
            Result cur = results[i];
            if (map.containsKey(cur.id) == false) map.put(cur.id, new PriorityQueue<>());
            PriorityQueue<Integer> pq = map.get(cur.id);
            pq.offer(cur.value);
            if (pq.size() > 5) pq.poll();
        }

        // step 2 compute res
        Map<Integer, Double> res = new HashMap<>();
        for (Integer e : map.keySet()) {
            PriorityQueue<Integer> pq = map.get(e);
            double sum = 0.0;
            while (!pq.isEmpty()) sum += pq.poll();
            res.put(e, sum / 5.00);
        }
        return res;
    }
}
