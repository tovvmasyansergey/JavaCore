package chapters.chapter9.staticInterface;

public class Demo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getNumber());
        System.out.println(myClass.getString());
        System.out.println(MyIf.getDefaultNumber());
    }
}
