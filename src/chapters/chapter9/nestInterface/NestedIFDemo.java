package chapters.chapter9.nestInterface;

public class NestedIFDemo{
    public static void main(String[] args) {
        A.NestedIF a = new B();
        if (a.isNotNegative(10)){
            System.out.println(true);
        }
        if (a.isNotNegative(-12)){
            System.out.println(false);
        }
    }
}
