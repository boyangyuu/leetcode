package heap;


import java.util.*;

public class heap_347_TopKFrequentElements {
    public static void main(String[] args) {

    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // value times
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }

        Comparator com = new Comparator() { // todo bug2
            @Override
            public int compare(Object o1, Object o2) {
//                System.out.println(map.get(o1));
                return -(map.get(o1) - map.get(o2));  // todo bug3 倒序
            }
        };
        PriorityQueue<Integer> heap = new PriorityQueue<>(com); //todo bug1

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) heap.offer(entry.getKey());
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) res.add(heap.poll());
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
 ######s1######


 ######s2######

 TODO case

 TODO bug
 bug1
 PriorityQueue<Integer> heap = new PriorityQueue<>(); //todo bug1
 =>
 PriorityQueue<Integer> heap = new PriorityQueue<>(com); //todo bug1

 bug2
 Comparator com = new Comparator() { // todo bug2
 @Override
 public int compare(Object o1, Object o2) {
 System.out.print(map.get(o1));
 return map.get(o1) - map.get(o2);
 }
 };
 =>
 Comparator<Integer> com = new Comparator<Integer>() { // todo bug2
 public int compare(Integer o1, Integer o2) {

 bug3
 return (map.get(o1) - map.get(o2));  // todo bug3 倒序
 =>
 return -(map.get(o1) - map.get(o2));  // todo 构造小的优先,大的先出

 TODO follow

 */

/*
TODO tutorial


 */
