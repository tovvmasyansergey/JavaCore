package chapters.chapter9.defaultInterface;

public class MyIfImp2 implements  MyIf{
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "this called from MyIfImp2";
    }
}
