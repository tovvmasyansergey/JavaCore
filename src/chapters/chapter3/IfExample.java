package chapters.chapter3;

public class IfExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        int c = Math.max(a, b);
        System.out.println(c);
    }
}