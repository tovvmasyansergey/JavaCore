package classwork.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        System.out.println(myBox.height);
        System.out.println(myBox.width);
        System.out.println(myBox.depth);
        myBox.width = 3.4;
        myBox.height = 4;
        myBox.depth = 4.4;
        System.out.println(myBox.height);
        System.out.println(myBox.width);
        System.out.println(myBox.depth);
        System.out.println(myBox1.depth);
    }
}
