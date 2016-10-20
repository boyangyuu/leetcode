import java.util.*;

public class common_0_tutorial {
    public static void main(String[] args) {
        //todo arrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println("####");

        list.add(0,2);
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println("####");

        list.remove((Object) 3);
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println("####");

        //todo queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);queue.add(2);
        queue.peek(); // 1 队列 先进先出

        //


        //todo linkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
    }

    /*
    ##########定义private class
     */

    private class A {
        int id;
        public A(int id) {

        }
    }




}
/** 题
 *



TODO tutorial

 todo arrayList


 {1,2,3}
 add
 list.add(4) =>{1,2,3,4}  O(n)
 otherwise : list.add(0,4) =>{4,1,2,3}

 remove
 list.remove((Integer) 3); 删除对象 O(n)

                insert     read     delete
 ArrayList        n          1        n
 LinkedList       1          n        1


 */
