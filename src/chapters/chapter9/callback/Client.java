package chapters.chapter9.callback;

public class Client implements Callback {

    @Override
    public void callback(int param) {
        System.out.println(param);
    }

    public void nonIFaceMeth(){
        System.out.println("Method");
    }
}
