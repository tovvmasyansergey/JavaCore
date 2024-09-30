package chapters.chapter6.box3;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        myBox.setDim(2,3,4);
        myBox2.setDim(2,4,5);
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());
    }
}
