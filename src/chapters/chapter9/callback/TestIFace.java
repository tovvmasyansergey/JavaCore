package chapters.chapter9.callback;

public class TestIFace {
    public static void main(String[] args) {
        Callback callback = new Client();
        callback.callback(3);
        Client client = new Client();
        client.nonIFaceMeth();
        Callback callback1;
        callback1 = new Client();
    }
}
