package chapters.chapter9.defaultInterface;

public class DefaultMethodDemo{
    public static void main(String[] args) {
        MyIfImp myIfImp = new MyIfImp();
        System.out.println(myIfImp.getNumber());
        System.out.println(myIfImp.getString());
        MyIfImp2 myIfImp2 = new MyIfImp2();
        System.out.println(myIfImp2.getNumber());
        System.out.println(myIfImp2.getString());
    }
}
