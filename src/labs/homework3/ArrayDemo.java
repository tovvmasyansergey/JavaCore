package labs.homework3;

public class ArrayDemo {
    public static void main(String[] args) {
        Array.createArray(12);
        Array.create2dArray(5,5);
        int[] array = {1,2,3,4};
        int[] result = Array.addFirst(array, 34);
        for (int i : result) {
            System.out.println(i);

        }
        System.out.println(Array.contains(array, 4));
        System.out.println(Array.contains(array, 67));
        System.out.println(Array.indexOf(array, 3));
    }
}
