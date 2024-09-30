package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double volume;
        myBox.width = 2;
        myBox.depth = 2;
        myBox.height = 2;
        volume = myBox.depth * myBox.height * myBox.depth;
        System.out.println(volume);
    }
}
