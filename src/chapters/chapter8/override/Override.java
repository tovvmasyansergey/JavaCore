package chapters.chapter8.override;

public class Override {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        System.out.println(b.k);
        System.out.println(b.i);
        System.out.println(b.j);
        System.out.println();
        b.show();
        A a;
        a = b;
        System.out.println();
        System.out.println(a.i);
        System.out.println(a.j);
        System.out.println();
        a.show();
    }
}
