package hankerrank;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by yuboyang on 8/1/17.
 */
public class Solution2 {
    static Random random = new Random();
    private final int percentile = 90;
    private final int processingTimeScale = 1000; // the accuracy rate of processing time will be xxx.000 ms
    private final int processingTimeRange = 150;
    private int minuteTimeStamp1 = -1, minuteTimeStamp2 = -1;
    private int[] processingTimeBucketInMinute1;
    private int[] processingTimeBucketInMinute2;

    public static void runTest() {
        Solution2 solution = new Solution2();
        int numberOfRecords = 1000000;
        for (int i = 0; i < numberOfRecords; i++) {
            try {
                Thread.sleep(1); // simulate the time offset between the data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long timestamp = System.currentTimeMillis() / 1000 - random.nextInt(70);
            double processingTime = random.nextInt(solution.processingTimeRange) + (double)random.nextInt(1000) / 1000;
            solution.record(timestamp, processingTime);
        }
    }

    public static void main(String[] args) {
        // hi, you can run the runTest() method, then comment other lines in this main method
        runTest();

//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
//            String[] strs = s.split(" ");
//            Solution solution = new Solution();
//            solution.record(Long.parseLong(strs[0]), Double.parseDouble(strs[1]));
//        }
    }

    public Solution2() {
        minuteTimeStamp1 = (int)(getNowTime() / 60) * 60 - 60;
        minuteTimeStamp2 = (int)(getNowTime() / 60) * 60 ;
        int length = processingTimeRange * processingTimeScale;
        processingTimeBucketInMinute1 = new int[length + 1];
        processingTimeBucketInMinute2 = new int[length + 1];
        this.timer();
    }

    public static int getNowTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }
    public void record(long timestamp, double latency) {
        int currentTime = getNowTime();
        if (currentTime - timestamp > 60) return;

        // bucket
        int latencyScaled = (int) (latency * processingTimeScale);
        if (latencyScaled > processingTimeRange * processingTimeScale) return;
        if (timestamp - minuteTimeStamp1 < 60) {
            processingTimeBucketInMinute1[latencyScaled]++;
        } else {
            processingTimeBucketInMinute2[latencyScaled]++;
        }
    }

    public String format(long time) {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        String d = format.format(time * 1000);
        return d.toString();
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

        int index = count * percentile / 100;
        count = 0;
        double percentileLatency = 0.000;
        for (int i = 0; i < processingTimeBucketInMinute1.length; i++) {
            count += processingTimeBucketInMinute1[i];
            if (count >= index) {
                percentileLatency = (double)(i) / processingTimeScale;
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

    public void timer() {

        Runnable runnable = new Runnable() {
            public void run() {
                //System.out.println(getNowTime());
                if (getNowTime() % 60 == 0) outputPercentile();
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
    }
}
