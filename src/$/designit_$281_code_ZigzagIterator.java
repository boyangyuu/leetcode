package $;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


// todo 深入实践 linkedList (栈用法, 双向队列用法 )
// todo 需要code , slow idea
// 找相似tag

public class designit_$281_code_ZigzagIterator {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);ls.add(2);ls.add(3); //  add == addLast(1->2->3) , remove == removeLast
        System.out.println(ls.removeFirst());
        System.out.println(ls.removeLast());
        System.out.println(ls);


    }
    LinkedList<Iterator<Integer>> ls = new LinkedList<>();

    public designit_$281_code_ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        if (v1.iterator().hasNext()) ls.add(v1.iterator());
        if (v2.iterator().hasNext()) ls.add(v2.iterator());
    }

    public int next() {
        Iterator<Integer> it = ls.removeFirst();
        int v = it.next();
        if (it.hasNext()) ls.add(it);
        return v;
    }

    public boolean hasNext() {
        return ls.isEmpty() == false;
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
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######
 TODO case

 TODO bug
 bug1

 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
