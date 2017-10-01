package hankerrank;

import java.util.Scanner;

/**
 * Created by yuboyang on 7/25/17.
 */
public class Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println("Int: " + sc.nextInt());
            } else if (sc.hasNextDouble())
                System.out.println("Double: " + sc.nextDouble());
            else {
                System.out.println("String: " + sc.nextLine());
            }
        }


    }
}
