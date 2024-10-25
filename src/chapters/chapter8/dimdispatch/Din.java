package chapters.chapter8.dimdispatch;

public class Din {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();
        parent.printL();
        child.printL();
    }
}
