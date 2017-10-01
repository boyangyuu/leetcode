package hankerrank;

import java.util.*;

/**
 * Created by yuboyang on 8/1/17.
 */
public class Solution3 {
    private static class Record{
        long t ;
        int time;

        public Record(long t, int time) {
            this.t = t;
            this.time = time;
        }
    }

    static Random random = new Random();
    private final double percentile = 0.90;
    private final int processingTimeRange = 150;
    private final int processingTimeScale = 1; // the accuracy rate of processing time will be xxx.000 ms
    private int minuteTimeStamp1 = -1, minuteTimeStamp2 = -1;
    private int[] processingTimeBucketInMinute1;
    private int[] processingTimeBucketInMinute2;

    public static void runTest() {
        //test
        Solution3 solution = new Solution3();
        List<Record> list = new ArrayList<>();
        list.add(new Record(96266800, 1));
        list.add(new Record(96266861, 1));
        list.add(new Record(96266920, 1));
        list.add(new Record(96266861, 100));

        for (int i = 0; i < list.size(); i++) {
            Record r = list.get(i);
            long timestamp = r.t;
            double processingTime = r.time;
            if (solution.minuteTimeStamp1 == -1) {
                solution.minuteTimeStamp1 = (int)(timestamp / 60) * 60;
                solution.minuteTimeStamp2 = (int)(timestamp / 60) * 60 + 60;
            }

            if (timestamp >= solution.minuteTimeStamp1 + 120) {
                solution.outputPercentile();
            }
            solution.record(timestamp, processingTime);
        }
        solution.outputPercentile();
        solution.outputPercentile();

    }

    public static void main(String[] args) {
        runTest();

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Solution3 solution = new Solution3();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] strs = s.split(" ");
            long timestamp = Long.parseLong(strs[0]);
            double processingTime = Double.parseDouble(strs[1]);
            if (solution.minuteTimeStamp1 == -1) {
                solution.minuteTimeStamp1 = (int)(timestamp / 60) * 60;
                solution.minuteTimeStamp2 = (int)(timestamp / 60) * 60 + 60;
            }
            if (timestamp >= solution.minuteTimeStamp1 + 120) {
                solution.outputPercentile();
            }
            solution.record(timestamp, processingTime);
        }

        solution.outputPercentile();
        solution.outputPercentile();
    }

    public Solution3() {
        int length = processingTimeRange * processingTimeScale;
        processingTimeBucketInMinute1 = new int[length + 1];
        processingTimeBucketInMinute2 = new int[length + 1];
    }

    public void record(long timestamp, double latency) {
        // bucket
        int latencyScaled = (int) (latency * processingTimeScale);
        if (timestamp - minuteTimeStamp1 < 60) {
            processingTimeBucketInMinute1[latencyScaled]++;
        } else {
            processingTimeBucketInMinute2[latencyScaled]++;
        }
        System.out.println("recorded " + timestamp + ", " + latency);
        System.out.println(Arrays.toString(processingTimeBucketInMinute1));
        System.out.println(Arrays.toString(processingTimeBucketInMinute2));
    }

    public String format(long time) {
        return "" + time;
//        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        String d = format.format(time * 1000);
//        return d.toString();
    }

    /*
    once the now time is new minute as minute1, the minute period in (minute - 2) will not receive
     any with data which is within latency of 60s.
    example: once the current system time is 14:30:00, we can output percentile during the minute 14:28:00~14:28:59
    then update the minuteTimeStamp1 as 14:29:00, the minuteTimeStamp2 as 14:30:00
     */
    public void outputPercentile() {
        int count = 0;
        for (int i = 0; i < processingTimeBucketInMinute1.length; i++)
            count += processingTimeBucketInMinute1[i];
        long index = Math.round(count * percentile);
        count = 0;
        double percentileLatency = 0.000;
        for (int i = 0; i < processingTimeBucketInMinute1.length; i++) {
            count += processingTimeBucketInMinute1[i];
            if (count >= index) {
                percentileLatency = (double)i / processingTimeScale;
                break;
            }
        }

        System.out.println(format(this.minuteTimeStamp1) + " " + percentileLatency);

        //alloc new minute to store
        minuteTimeStamp1 = minuteTimeStamp2;
        minuteTimeStamp2 = minuteTimeStamp2 + 60;
        processingTimeBucketInMinute1 = processingTimeBucketInMinute2;
        processingTimeBucketInMinute2 = new int[processingTimeRange * processingTimeScale + 1];
    }
}
