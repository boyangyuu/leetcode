package $;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


// todo 每太看清题意 建议复习思路

public class designit_$284_slow_PeekingIterator implements Iterator<Integer> {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);ls.add(2);ls.add(3); //  add == addLast(1->2->3) , remove == removeLast
        System.out.println(ls.removeFirst());
        System.out.println(ls.removeLast());
        System.out.println(ls);


    }
    Iterator<Integer> it;
    boolean isMoved = false;
    int peek;

    public designit_$284_slow_PeekingIterator(Iterator<Integer> iterator) {
        it = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!isMoved) {
            peek = it.next();
            isMoved = true;
        }
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (isMoved) {
            isMoved = false;
            return peek;
        }
        else return it.next();
    }

    @Override
    public boolean hasNext() {
        if (isMoved == false && it.hasNext() == false) return false;
        else return true;
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
 maintain two variables boolean (call the next or not ) and current(peek) ,
 so if never call peek ,during  call peek should call it.next too,
 and once we call next() we should restore the boolean varible

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
