package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
       DynamicArray dy = new DynamicArray();
       dy.add(3);
        for (int i = 0; i < 12; i++) {
            dy.add(i);
        }
        dy.print();
        System.out.println(dy.getByIndex(4));
    }
}
