package design;


import java.util.*;


// todo need coding
public class design_341_slow_FlattenNestedListIterator {


      // This is the interface that allows for creating nested lists.
      // You should not implement it, or speculate about its implementation
      public interface NestedInteger {

          // @return true if this NestedInteger holds a single integer, rather than a nested list.
          public boolean isInteger();

          // @return the single integer that this NestedInteger holds, if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();

          // @return the nested list that this NestedInteger holds, if it holds a nested list
          // Return null if this NestedInteger holds a single integer
          public List<NestedInteger> getList();
      }

    public static void main(String[] args) {
        List list;Map map;
    }

    List<Integer> list = new ArrayList();
    Iterator<Integer> it;

    public design_341_slow_FlattenNestedListIterator (List<NestedInteger> nestedList) {
        add(nestedList, this.list);
        it = this.list.iterator();
    }

    public void add(List<NestedInteger> list, List<Integer> queue) {
        for (NestedInteger ni : list) {
            if (ni.isInteger()) queue.add(ni.getInteger());
            else add(ni.getList(), queue);
        }

    }


    public Integer next() {
        return it.next();
    }

    public boolean hasNext() {
        return it.hasNext();
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
 递归那里是难点, 建议好好研究下

 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
