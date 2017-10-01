package companys.spin;

/**
 * Created by yuboyang on 9/10/17.
 */
public class Test1 {
    public static void main(String[] args) {
        int[] a = {1};
        Test1 t = new Test1();
        t.in(a);
        System.out.println(a[a.length - 1]);
    }

    public void in(int[] a) {
        a[a.length - 1]++;
    }


}
