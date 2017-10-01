package companys.squarespace.javaclass.observe;

/**
 * Created by yuboyang on 9/3/17.
 */
public class SumSubject extends Observable {
    public static void main(String[] args) {
        SumSubject sumSubject = new SumSubject();
        SumObserver sumObserver = new SumObserver();
        sumSubject.registObserver(sumObserver);
        sumSubject.addToSum(10);
        sumSubject.addToSum(20);


    }
    private int sum = 0;


    void addToSum(int a) {
        this.sum += a;
        notifyObservers(this.sum);
    }

}
