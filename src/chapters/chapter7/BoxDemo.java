package chapters.chapter7;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(1.2);
        Box box2 = new Box(3,2,2);
        System.out.println(box.volume());
        System.out.println(box1.volume());
        System.out.println(box2.volume());
    }
}
