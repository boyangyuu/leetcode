package companys.audible.design.ParkLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a parking lot. One car type. Parking spaces are the same size
 * Created by yuboyang on 7/16/17.
 */
public class ParkingManager {
    List<ParkingSpot> list = new ArrayList<>();

    ParkingManager() {
        // init spots
    }

    List<Integer> getAvaliableSpots(Vehicle vehicle) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++) {
            ParkingSpot ps = this.list.get(i);
            if (ps.isFit(vehicle) && ps.isAvaliable()) list.add(i);
        }

        return list;
    }

    boolean orderSpot(int index) {
        ParkingSpot ps = this.list.get(index);
        if (ps.isAvaliable() == false) return false;
        ps.isAvaliable = false;
        return true;
    }

    boolean restoreSpot(int index) {
        //
        return true;
    }

}
