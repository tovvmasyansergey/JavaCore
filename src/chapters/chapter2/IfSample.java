package chapters.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x < y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("now x = y");
        }
        x *= 2;
        if (x > y) {
            System.out.println("x > y");
        }
        if (x == y) {
            System.out.println("this block dont work");
        }
    }
}
