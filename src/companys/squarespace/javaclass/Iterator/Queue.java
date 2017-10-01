package companys.squarespace.javaclass.Iterator;

import java.util.NoSuchElementException;

/**
 * Created by yuboyang on 9/3/17.
 */
public class Queue<Item> {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.pop();
//        queue.pop();
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
        iterator = queue.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    private class LinkedNode<Item> {
        Item val;
        LinkedNode next;
        LinkedNode (Item val) {
            this.val = val;
        }
    }

    QueueIterator<Item> iterator() {
        return new QueueIterator(this.first);
    }

    private class QueueIterator<Item> implements Iterator<Item> {
        private LinkedNode<Item> current;

        public QueueIterator(LinkedNode node) {
            this.current = node;
        }

        @Override
        public boolean hasNext() {
            return this.current != null; // todobug
        }

        @Override
        public Item next() {
            Item item = this.current.val;
            this.current = this.current.next;
            return item;
        }
    }

    private LinkedNode first;
    private LinkedNode last;
    private int count;

    public Queue () {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public void push(Item val) {
        this.count++;
        LinkedNode node = new LinkedNode(val);
        if (this.last == null) {
            this.first = node;
            this.last = node;
            return;
        } else {
            this.last.next = node;
            this.last = node;
            this.last.next = null;
        }
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException();
        this.count--;
        LinkedNode<Item> node = this.first;
        this.first = this.first.next;
        return node.val;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }


}
