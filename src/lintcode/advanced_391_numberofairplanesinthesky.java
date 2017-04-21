package lintcode;

import java.util.*;

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    class Pair {
        public int pos;
        public int flag; // 0: start 1: end

        public Pair(int pos, int flag) {
            this.pos = pos;
            this.flag = flag;
        }
    }

    class advanced_391_numberofairplanesinthesky {
        /**
         * @return: Count of airplanes are in the sky.
         */
        public int countOfAirplanes(List<Interval> airplanes) {
            // s1
            List<Pair> list = new ArrayList<>();
            for (Interval i : airplanes) {
                list.add(new Pair(i.start, 0));
                list.add(new Pair(i.end, 1));
            }

            //step 2
            Collections.sort(list, new Comparator<Pair>() {
                public int compare(Pair p1, Pair p2) {
                    if (p1.pos == p2.pos) return p2.flag - p1.flag;
                    return p1.pos - p2.pos;
                }
            });

            //step 3
            int max = 0, cnt = 0;
            for (Pair p : list) {
                if (p.flag == 0) cnt++;
                else cnt--;
                max = Math.max(max, cnt);
            }
            return max;

        }
    }
}