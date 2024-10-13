package chapters.chapter8.example2;

public class Access {
    public static void main(String[] args) {

        B b = new B();
        b.setIJ(2,3);
        b.sum();
        System.out.println(b.total);
    }
}