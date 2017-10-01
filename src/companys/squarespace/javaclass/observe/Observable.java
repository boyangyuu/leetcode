package companys.squarespace.javaclass.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuboyang on 9/3/17.
 */
public class Observable {
    List<Observer> observables = new ArrayList<>();

    void registObserver(Observer observable) {
        this.observables.add(observable);
    }

    void notifyObservers(Object object) {
        for (Observer o : this.observables) o.onNotified(this, object);
    }
}
