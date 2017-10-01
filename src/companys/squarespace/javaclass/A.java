package companys.squarespace.javaclass;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by yuboyang on 8/26/17.
 */
public class A {
    public A(){
        System.out.println("Construct A");
    }

    public String test() {
        System.out.println("A test");
        Random random = new Random();
        random.nextInt();
        return null;

    }

    public static void main(String[] args) {
//        int a = 10;
        A a = new A();
        a.getClass().getDeclaredMethods();

        Predicate1<Integer> p = (Integer b) -> b == 0;
        System.out.println(a.testL(p, 0));
        boolean b = a instanceof A;

        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        scanner.close();

    }

    public boolean testL(Predicate1 p, int number) {
        return p.test(number);
    }

    public void add (int ... arr) {
        int sum = 0;
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            s += arr[i];
            if (i < arr.length - 1) s += "+";

        }
        s+= "=" + sum;
        System.out.println(s);
    }
}
