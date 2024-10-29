package chapters.chapter12.enums.fruit;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RED_DEL;
        System.out.println(ap);
        ap = Apple.GOLDEN_DEL;
        System.out.println(ap);
        if (ap == Apple.GOLDEN_DEL){
            System.out.println(true);
        }
        switch (ap){
            case RED_DEL:
                System.out.println(ap);
                break;
            case WINESAP:
                System.out.println(ap);
                break;
            case CORTLAND:
                System.out.println(ap);
                break;
            case GOLDEN_DEL:
                System.out.println(ap);
                break;
        }
    }
}
