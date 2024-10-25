package chapters.chapter9.callback;

public class TestIFace2 {
    public static void main(String[] args) {
        Callback callback = new Client();
        AnotherClass anotherClass = new AnotherClass();
        callback.callback(2);
        callback = anotherClass;
        callback.callback(24);

    }
}
