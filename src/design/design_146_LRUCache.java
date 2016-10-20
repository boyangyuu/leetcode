package design;


import java.util.*;

public class design_146_LRUCache {
    public class Node {
        Node next;
        Node pre;
        int key;
        int value;
        Node(){

        }

        Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }



    public static int kcapacity;

    public Map<Integer, Node> maps = new HashMap<>(); // key value

    public Node sentinel;

    public design_146_LRUCache(int capacity) {
        kcapacity = capacity;
        sentinel = new Node();
        sentinel.next = sentinel;
        sentinel.pre = sentinel;
    }

    public void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node = null; // todo bug 1 没有意义 node 是引用, 除非node.val = null;
    }

    public void addNode(Node node){
        Node next = sentinel.next;
        node.next = next;
        node.pre = sentinel;
        sentinel.next = node;
        next.pre = node;
    }

    public int get(int key) {
        if (!maps.containsKey(key)) return -1;
        removeNode(maps.get(key));
        addNode(maps.get(key));
        return maps.get(key).value;
    }

    public void set(int key, int value) {
        if (maps.containsKey(key)) {
            Node node = maps.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
            maps.put(key, node);
        } else {
            Node node = new Node(key, value);
            addNode(node);
            maps.put(key, node);
            if (maps.size() > kcapacity) {
                maps.remove(sentinel.pre.key);
                removeNode(sentinel.pre);
            }
        }
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
 public List<Integer> cache = new ArrayList<>(); // keys todo bug 1 ETL
 =>
 public linkedList<Integer> cache = new linkedList<>(); // keys

 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
