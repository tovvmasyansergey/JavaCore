package chapters.chapter6.box4;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(2,2,2);
        Box myBox2 = new Box(3,3,3);
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());
    }
}
