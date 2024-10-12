package chapters.chapter7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();
        overloadDemo.test();
        overloadDemo.test(2);
        overloadDemo.test(3,4);
        double test = overloadDemo.test(23.4);
        System.out.println(test);
    }
}
