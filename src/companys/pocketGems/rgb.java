package companys.pocketGems;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by yuboyang on 7/17/17.
 */

class ItemInfo
{
    public String name;                       //Name of Item
    public int maximumStackSize;             //The maximum item that put into a slot
    public int value;                        //Single item's value


}


public class rgb {
    public static void main(String[] args) {

    }



    public int maxValue(int n, String[] items, ItemInfo[] infos){
        // init
        HashMap<String, Integer> mapCnt = new HashMap<>(); // itemType: count
        HashMap<String, Integer> mapMaxSize = new HashMap<>(); // itemType: maxSize
        HashMap<String, Integer> mapValue = new HashMap<>(); // item: value
        for (String s : items) mapCnt.put(s, mapCnt.getOrDefault(s, 0) + 1);
        for (ItemInfo i : infos) mapMaxSize.put(i.name, i.maximumStackSize);
        for (ItemInfo i : infos) mapValue.put(i.name, i.value);

        // build heap for each possible stack,
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((i1, i2)-> i1 - i2);
        for (String s : mapCnt.keySet()) {
            int cnt = mapCnt.get(s);
            int value = mapValue.get(s);
            int size = mapMaxSize.get(s);
            for (int i = 0; i < cnt; ) {
                if (i + size < cnt) {
                    pq.add(size * value);
                    i += size;
                } else {
                    pq.add((cnt - i ) * value);
                    i = cnt;
                }
            }
        }

        // get the top n of the heap
        //
        return 0;
    }
}
