package chapters.chapter7.staticExample;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        meth(42);
    }
}