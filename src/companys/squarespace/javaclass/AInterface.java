package companys.squarespace.javaclass;

/**
 * Created by yuboyang on 8/26/17.
 */
public interface AInterface {
    int a = 0;
    void print() ;
    default void print(int a) {
        System.out.println("a");
    }
}
