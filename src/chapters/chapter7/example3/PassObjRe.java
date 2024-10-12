package chapters.chapter7.example3;

public class PassObjRe {
    public static void main(String[] args) {
        Test test = new Test(2, 3);
        test.meth(test);
        System.out.println(test.a + " " + test.b);
    }
}
