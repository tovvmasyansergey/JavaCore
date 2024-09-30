package chapters.chapter6.box2;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        myBox.width = 2;
        myBox.height = 2;
        myBox.depth = 2;
        myBox2.width = 20;
        myBox2.height = 20;
        myBox2.depth = 20;
        myBox.volume();
        myBox2.volume();
    }
}
