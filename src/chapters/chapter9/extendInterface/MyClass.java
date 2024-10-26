package chapters.chapter9.extendInterface;

public class MyClass implements B {

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
}
