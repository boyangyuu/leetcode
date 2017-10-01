package design;


import java.util.HashMap;
import java.util.LinkedList;



public class design_146_LRUCache1 {
    private LinkedList<Integer> list;
    private class Node {
        Node prev;
        Node next;
        int key;
        int value;
    }

    Node removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node;
    }

    void addHead(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    Node removeTail() {
        return this.removeNode(this.tail.prev);
    }

    Node head = new Node(), tail = new Node();
    int count = 0;
    int capacity = 0;
    HashMap<Integer, Node> map = new HashMap<>();

    public design_146_LRUCache1(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key) == false) return -1;
        this.removeNode(map.get(key));
        this.addHead(map.get(key));
        return map.get(key).value;
    }

    public void set(int key, int value) {
        if (!this.map.containsKey(key)) {
            Node node = new Node();
            node.key = key;
            node.value = value;
            if (this.count >= this.capacity) {
                Node removed = this.removeTail();
                this.map.remove(removed.key);
            }
            this.addHead(node);
            this.count++;
            this.map.put(key, node);
        } else {
            Node node = this.map.get(key);
            this.removeNode(node);
            this.addHead(node);
            node.value = value;
        }
    }


}
