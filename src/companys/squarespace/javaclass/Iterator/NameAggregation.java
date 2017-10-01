package companys.squarespace.javaclass.Iterator;

import java.util.LinkedList;

/**
 * Created by yuboyang on 9/3/17.
 */
public class NameAggregation extends AbstractAggregation {
    private String[] names;

    public static void main(String[] args) {
        NameAggregation nameAggregation = new NameAggregation(new String[]{"a", "b"});
        Iterator<String> iterator = nameAggregation.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    public NameAggregation(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private LinkedList<String> queue = new LinkedList<>();
        public NameIterator() {
            for(String name : names) this.queue.offerFirst(name);
        }

        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < names.length;
        }

        @Override
        public String next() {
            this.index++;
            return this.queue.pollLast();
        }
    }
}
