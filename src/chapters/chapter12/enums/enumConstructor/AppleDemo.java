package chapters.chapter12.enums.enumConstructor;

public class AppleDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println(Apple.CORTLAND.getPrice());
        Apple[] values = Apple.values();
        for (Apple value : values) {
            System.out.println(value + " " + value.getPrice() + "\n");
        }
    }
}
