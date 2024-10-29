package chapters.chapter12.enums.enummethods;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple apple;
        Apple apple1;
        Apple apple2;
        Apple[] values = Apple.values();
        for (Apple value : values) {
            System.out.println(value + " " + value.ordinal());
        }
        if (Apple.CORTLAND.compareTo(Apple.JONATHAN) < 0){
            System.out.println(true);
        }
        if (Apple.RED_DEL.compareTo(Apple.JONATHAN) == 1){
            System.out.println(true);
        }
        if (Apple.RED_DEL.equals(Apple.CORTLAND)){
            System.out.println(true);
        }
        if (Apple.RED_DEL == Apple.RED_DEL){
            System.out.println(true);
        }
    }
}
