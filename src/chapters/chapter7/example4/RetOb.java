package chapters.chapter7.example4;

public class RetOb {
    public static void main(String[] args) {
        Test test = new Test(10);
        Test test1;
        test1 = test.incrByTen();
        System.out.println(test.a);
        System.out.println(test1.a);
    }
}
