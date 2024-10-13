package chapters.chapter8.superExample5;

public class UseSuper {
    public static void main(String[] args) {
        B b = new B(2,3);
        b.show();
        System.out.println(b.i);
        A a;
        a = b;
        System.out.println(a.i);

    }
}
