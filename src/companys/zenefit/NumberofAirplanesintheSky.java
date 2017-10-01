package companys.zenefit;

import array.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuboyang on 8/20/17.
 */
public class NumberofAirplanesintheSky {
    static class Pair {
        int pos;
        boolean isStart;

        public Pair(int pos, boolean isStart) {
            this.pos = pos;
            this.isStart = isStart;
        }
    }

    public static void main(String[] args) {


    }
    public static int countOfAirplanes(List<Interval> airplanes) {
        // build list of pair
        List<Pair> list = new ArrayList<>();
        for (Interval i : airplanes) {
            list.add(new Pair(i.start, true));
            list.add(new Pair(i.end, false));
        }

        // sort
        list.sort((p1, p2)-> {
            if (p1.pos == p2.pos) return p1.isStart ? 1 : -1;
            return p1.pos - p2.pos;
        });

        // count
        int count = 0, max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isStart) count++;
            else count--;
            max = Math.max(max, count);
        }
        return count;

    }
}

