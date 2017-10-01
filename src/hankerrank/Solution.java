package hankerrank;

import java.text.SimpleDateFormat;
import java.util.*;
public class Solution {

    static Random random = new Random();
    private double percentile = 0.90;
    private int range = 150;
    private int scaleFactor = 100; // the accuracy rate of processing time
    private int precedingTimeStamp1 = -1, precedingTimeStamp2 = -1;
    private int[] bucketOfPrecedingTime1;
    private int[] bucketOfPrecedingTime2;


    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,2);

        System.out.println(map.size());
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Solution solution = new Solution(0.90, 150, 100);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] strs = s.split(" ");
            long timestamp = Long.parseLong(strs[0]);
            double processingTime = Double.parseDouble(strs[1]);
            if (solution.precedingTimeStamp1 == -1) {
                solution.precedingTimeStamp1 = (int)(timestamp / 60) * 60;
                solution.precedingTimeStamp2 = (int)(timestamp / 60) * 60 + 60;
            }
            if (timestamp >= solution.precedingTimeStamp1 + 119) {
                solution.outputPercentile();
            }
            solution.record(timestamp, processingTime);
        }

        solution.outputPercentile();
        solution.outputPercentile();
    }

    public Solution(double percentile, int range, int scaleFactor) {
        this.percentile = percentile;
        this.range = range;
        this.scaleFactor = scaleFactor;
        int length = range * scaleFactor;
        bucketOfPrecedingTime1 = new int[length + 1];
        bucketOfPrecedingTime2 = new int[length + 1];
    }

    public void record(long timestamp, double processTime) {
        int processTimeScaled = (int) (processTime * scaleFactor);
        if (timestamp < precedingTimeStamp1) return;
        if (timestamp - precedingTimeStamp1 < 60) {
            bucketOfPrecedingTime1[processTimeScaled]++;
        } else {
            bucketOfPrecedingTime2[processTimeScaled]++;
        }

    }

    public String format(long time) {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String d = format.format(time * 1000);
        return d.toString();
    }

    public void outputPercentile() {
        int count = 0;
        for (int i = 0; i < bucketOfPrecedingTime1.length; i++)
            count += bucketOfPrecedingTime1[i];
        double index = Math.ceil(count * percentile);
        count = 0;
        double percentileLatency = 0.000;
        for (int i = 0; i < bucketOfPrecedingTime1.length; i++) {
            count += bucketOfPrecedingTime1[i];
            if (count >= index) {
                percentileLatency = (double)i / scaleFactor;
                break;
            }
        }
        System.out.println(format(this.precedingTimeStamp1) + " " + percentileLatency);

        //alloc new minute to store
        precedingTimeStamp1 = precedingTimeStamp2;
        precedingTimeStamp2 = precedingTimeStamp2 + 60;
        bucketOfPrecedingTime1 = bucketOfPrecedingTime2;
        bucketOfPrecedingTime2 = new int[range * scaleFactor + 1];
    }
}