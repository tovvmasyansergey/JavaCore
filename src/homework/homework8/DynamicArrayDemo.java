package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            dy.add(i);
        }
        dy.print();
        dy.deleteByIndex(0);
        dy.set(3, 23);
        dy.print();
        dy.add(0, 34);
        dy.print();
//        System.out.println(dy.exists(3));
//        System.out.println(dy.exists(100));
//        System.out.println(dy.getIndexByValue(34));
    }
}
