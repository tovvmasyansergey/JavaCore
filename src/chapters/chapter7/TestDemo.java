package chapters.chapter7;

public class TestDemo {
    public static void main(String[] args) {
        Test test = new Test(100, 20);
        Test test1 = new Test(100, 20);
        Test test2 = new Test(23, 23);
        System.out.println("test == test2 " + test1.equalTo(test));
        System.out.println("test1 == test2 " + test1.equalTo(test2));

}
}
