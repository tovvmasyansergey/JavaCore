package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double volume;
        myBox.width = 2;
        myBox.depth = 2;
        myBox.height = 2;
        volume = myBox.depth * myBox.height * myBox.depth;
        System.out.println(volume);
        volume = myBox2.depth * myBox2.height * myBox2.depth;
        System.out.println(volume);
    }
}
