package unionFind;

/**
 * Created by yuboyang on 2/20/17.
 */
public class uf_ConnectingGraph {

    public static void main(String[] args) {
        /*
query(1,2)
connect(1,2)
query(1,3)
connect(2,4)
query(1,4)
         */
    }

    int father[] = null;
    public uf_ConnectingGraph(int n) {
        // initialize your data structure here.
        this.father = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            this.father[i] = i;
        }

    }

    public int find(int a) {
        if (father[a] == a) return a;
        return father[a] = find(father[a]);
    }

    public void connect(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        father[root_a] = father[root_b];
    }

    public boolean query(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        return root_a == root_b;
    }

}
