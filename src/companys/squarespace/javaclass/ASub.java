package companys.squarespace.javaclass;

/**
 * Created by yuboyang on 8/26/17.
 */
class ASub extends A {
    public ASub () {
        System.out.println("Asub construction");
    }

    public String test() {
        return super.test();
    }

    public static void main(String[] args) {
        ASub aSub = new ASub();
        aSub.test();
    }
}
