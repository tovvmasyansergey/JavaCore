package chapters.chapter9.callback;

public class AnotherClass implements Callback {

    @Override
    public void callback(int param) {
        System.out.println(param * param);
    }
}
