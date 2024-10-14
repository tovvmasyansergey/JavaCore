package chapters.chapter8.abstractexample;

public abstract class A {
    abstract void callMe();

    void callMeToo() {
        System.out.println("this is concrete method");
    }
}
