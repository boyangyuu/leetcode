package hankerrank;

/**
 * Created by yuboyang on 8/12/17.
 */
public class wepay1 {
    public static void main(String[] args) {
//        System.out.println(Math.pow(2.0, 3.0));
        byte[] arr = new byte[Integer.MAX_VALUE];
        arr[0] = 1;
        System.out.println(arr[0]);
        //System.out.println(arr[0] == 0.0);
//        System.out.println(getPowerNumber(0));
//        System.out.println(getPowerNumber(8));
//        System.out.println(getPowerNumber(0));
//        System.out.println(getPowerNumber(11111));
    }

//    static int getPowerNumber1(int index) {
//        int dp[] = new int[index + 1];
//
//    }

    static int getPowerNumber(int index) {
//        int maxValue = (int)Math.pow(2, index / 2 + 1);
        int maxValue = (Integer.MAX_VALUE - 1) ;
//        System.out.println(maxValue);
        boolean[] arr = new boolean[maxValue];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }

        for (int i = 2; i < maxValue; i++) {
            int cur = (int)Math.pow(i, 2);
            while (cur <= maxValue && cur > 0 && arr[cur] == false) {
                arr[cur] = true;
                cur = cur * i;
            }
        }
//        System.out.println(Arrays.toString(arr));
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != false) cnt++;
            if (cnt == index + 1) return i;
        }
        return -1;
    }
}
