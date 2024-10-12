package chapters.chapter7.example;

public class OverloadCons2 {
    public static void main(String[] args) {
     Box box = new Box(12,2,12);
     Box box1 = new Box();
     Box box2 = new Box(box);
        System.out.println(box.volume());
        System.out.println(box1.volume());
        System.out.println(box2.volume());

    }
}
