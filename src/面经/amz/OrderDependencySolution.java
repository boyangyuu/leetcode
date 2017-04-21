package 面经.amz;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

/*
better to reivew 207 leetcode first

11.18更新一下，今天队友上岸，同时听闻好朋友的室友等了两个月终于等来了OA，心情大好，打算把这道题的code升级到终极版本，原来的内容就不保存了，因为写过的文章就像人民币，发了新版，旧版就没人要了。
随着赛程的深入，这道题不再和video发生关系。这道题的坑就是，多个Order会对应同一个order name（String），那么在排序的时候这多个order只出现一个。

题目大概内容是这样的，。
input OrderDependency的object every OrderDependency contains 2 order
output the proper orders


 */

/**
 * Created by yuboyang on 2/20/17.
 */


class Order{
    String orderName;
    public Order(String string){
        this.orderName = string;
    }
}

class OrderDependency{
    Order cur;
    Order pre;
    public OrderDependency(Order pre, Order cur){
        this.pre = pre;
        this.cur = cur;
    }
}

public class OrderDependencySolution {



    public static void main(String[] args) {
        Order o1 = new Order("泡面");
        Order o2 = new Order("泡面");
        Order o3 = new Order("SF");
        Order o4 = new Order("租车");
        Order o5 = new Order("SF");
        Order o6 = new Order("泡面");
        Order o7 = new Order("租车");
        Order o8 = new Order("SF");
        Order o9 = new Order("爽(每个行为只输出了一次对吧)");
        OrderDependency od1 = new OrderDependency(o1, o3);
        OrderDependency od2 = new OrderDependency(o2, o7);
        OrderDependency od3 = new OrderDependency(o3, o9);
        OrderDependency od4 = new OrderDependency(o4, o3);
        OrderDependency od5 = new OrderDependency(o6, o9);
        OrderDependency od6 = new OrderDependency(o8, o9);
        OrderDependency od7 = new OrderDependency(o2, o5);

        List<OrderDependency> list = new ArrayList<>();
        list.add(od1);
        list.add(od2);
        list.add(od3);
        list.add(od4);
        list.add(od5);
        list.add(od6);
        list.add(od7);
        //最后输出就是这种形式
        List<Order> res = solution(list);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i).orderName);
            if (i+1 < res.size()){
                System.out.print(" -> ");
            }
        }

    }

    public static List<Order> solution(List<OrderDependency> orderDependencies){
        // step 1 create graph, inDegree
        HashMap<Order, Set<Order>> graph = new HashMap<>();
        HashMap<Order, Integer> inDegree = new HashMap<>();
        for (OrderDependency e : orderDependencies) {
            if (!graph.containsKey(e.pre)) graph.put(e.pre, new HashSet<>());
            if (!graph.containsKey(e.cur)) graph.put(e.cur, new HashSet<>());
            if (!inDegree.containsKey(e.pre)) inDegree.put(e.pre, 0);
            if (!inDegree.containsKey(e.cur)) inDegree.put(e.cur, 0);

            graph.get(e.pre).add(e.cur);
            inDegree.put(e.cur, inDegree.get(e.cur) + 1);
        }

        // step 2 cut the order (choose indegree is 0 one ) one by one
        List<Order> res = new ArrayList<>();

        int size = inDegree.size();
        for (int i = 0; i < size; i++) {
            if (inDegree.isEmpty()) return res;
            boolean isCut = false;
            // check which is 0 indegree
            for (Order e : inDegree.keySet()) {
                if (inDegree.get(e) == 0) {
                    res.add(e);
                    for (Order pre : graph.get(e)) {
                        inDegree.put(pre, inDegree.get(pre) - 1);
                    }
                    inDegree.remove(e);
                    isCut = true;
                    break;
                }
            }
            if (isCut == false) return new ArrayList<>();
        }
        return res;
    }
}
