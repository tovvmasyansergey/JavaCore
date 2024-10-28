package chapters.chapter10.classwork;
public class ThrowExample {
    static void myMethod(int a) {
        if (a == 100) {
            throw new MyCustomException();
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int num = 100;
        if (num != 100) {
            myMethod(num);
        }

    }
}