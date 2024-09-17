package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b) {
            System.out.println("this is right");
        }
        b = false;
        if (b){
            System.out.println("this is not right");
    }
    }
}
