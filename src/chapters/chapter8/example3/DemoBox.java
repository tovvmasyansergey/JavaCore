package chapters.chapter8.example3;

public class DemoBox {
    public static void main(String[] args) {

        BoxWeight boxWeight = new BoxWeight(1, 2, 3, 5);
        BoxWeight boxWeight1 = new BoxWeight(10, 20, 30, 50);
        double vol;
        System.out.println(boxWeight.volume());
        System.out.println(boxWeight.weight);
        System.out.println(boxWeight1.volume());
        System.out.println(boxWeight1.weight);
    }
}
