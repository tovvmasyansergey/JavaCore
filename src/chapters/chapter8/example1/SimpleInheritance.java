package chapters.chapter8.example1;

public class SimpleInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.k = 10;
        b.i = 10;
        b.j = 10;
        b.sumIJK();
        b.showij();
        a.i = 30;
        a.j = 30;
        a.showij();
    }
}
