package companys.squarespace.javaclass.observe;

/**
 * Created by yuboyang on 9/3/17.
 */
public class SumObserver implements Observer {
    @Override
    public void onNotified(Observable observable, Object object) {
        Integer sum = (Integer) object;
        System.out.println(sum);
    }
}
