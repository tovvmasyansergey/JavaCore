package chapters.chapter8.superExample4;

public class DemoSuper {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(3.9);
        Box box2 = new Box(2.0,3.4,3.5);
        Box box3 = new Box(box1);
        BoxWeight boxWeight = new BoxWeight();
        BoxWeight boxWeight1 = new BoxWeight(3,4);
        BoxWeight boxWeight2 = new BoxWeight(1,2,3,4);
        BoxWeight boxWeight3 = new BoxWeight(boxWeight1);
        Box box4 = new Box(boxWeight2);
        System.out.println(box.volume());
        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(boxWeight.volume());
        System.out.println(boxWeight1.volume());
        System.out.println(boxWeight2.volume());
        System.out.println(boxWeight3.volume());
    }
}
