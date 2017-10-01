package systemDesign.c3_consistentHash_tinyurl;

import java.util.*;

/**
 * Created by yuboyang on 7/28/17.
 */

/*
todo use the treeMap ,
todo reasons : key is sorted, find the closet shard index will cost logn,
 */
public class ConsistentHash2 {
    TreeMap<Integer, Integer> tm = new TreeMap<>(); // shard id : machine id

    private int[] randomNums;
    private int size = 0; // size of used shard id
    private int k;

    public static void main(String[] args) {
        ConsistentHash2 ch = new ConsistentHash2(100, 3); // 100个micro, 每台3个
        ch.addMachines(1);
        System.out.println(ch.getMachineIdByHashCode(40));
        ch.addMachines(2);
        System.out.println(ch.getMachineIdByHashCode(40));
        ch.addMachines(3);
        System.out.println(ch.getMachineIdByHashCode(40));
    }

    public ConsistentHash2(int n, int k) {
        // init the randomNums, for create the machine's micro shards
        this.randomNums = new int[n];
        for (int i = 0; i < this.randomNums.length; i++) this.randomNums[i] = i;

        // shuffle the randomNums
        Random random = new Random();
        for (int i = 0; i < this.randomNums.length; i++) {
            int j = random.nextInt(i + 1);
            int temp = this.randomNums[i];
            this.randomNums[i] = this.randomNums[j];
            this.randomNums[j] = temp;
        }

        this.k = k;
    }

    // @param n a positive integer, the number of micro shards
    // @param k a positive integer, the number of micro shards in each machine
    // @return a ConsistentHash2 obj
    public static ConsistentHash2 create(int n, int k) {

        return new ConsistentHash2(n, k);
    }

    // @param machine_id an integer
    // @return a list of shard ids
    public List<Integer> addMachines(int machine_id) {
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < this.k; i++) {
            ids.add(this.randomNums[this.size]);
            tm.put(this.randomNums[this.size++], machine_id);
        }
        System.out.println("add machines: " + ids);
        // todo re allocate
        return ids;
    }

    // @param hashcode an integer
    // @return a machine id
    public int getMachineIdByHashCode(int hashcode) {
        if (tm.isEmpty()) return 0;
        System.out.println(tm);
        Integer ceiling = tm.ceilingKey(hashcode); // logn
        System.out.println("find the closet shard id:" + ceiling);
        if (ceiling != null) return this.tm.get(ceiling);
        return this.tm.get(tm.firstKey());
    }
}
