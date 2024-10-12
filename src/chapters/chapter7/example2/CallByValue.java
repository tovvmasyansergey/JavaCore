package chapters.chapter7.example2;

public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 10;
        int b = 20;
        System.out.println("a and b before " + a + " " + b);
        test.meth(a, b);
        System.out.println("a and b after " + a + " " + b);
    }
}
