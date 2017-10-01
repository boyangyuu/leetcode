package companys.audible.design.ParkLot;

/**
 * Created by yuboyang on 7/16/17.
 */
public class ParkingSpot {
    boolean isAvaliable = true;
    int space; // 0-4

    boolean isFit(Vehicle v) {
        return v.spaceNeeded <= space;
    }

    boolean isAvaliable() {
        return this.isAvaliable;
    }
}
