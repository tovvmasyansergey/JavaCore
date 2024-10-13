package chapters.chapter8.example3;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(2,3,4,5);
        Box box = new Box();
        System.out.println(boxWeight.volume());
        System.out.println(boxWeight.weight);
        box = boxWeight;
        System.out.println(box.volume());
        Box b = (Box) box;
    }
}
