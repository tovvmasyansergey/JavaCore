package chapters.chapter12.fruit;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        Apple[] values = Apple.values();
        for (Apple value : values) {
            System.out.println(value);
        }
        Apple wine = Apple.valueOf("WINESAP");
    }
}
