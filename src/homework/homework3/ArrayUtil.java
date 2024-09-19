package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 45, 0, 33, 0, 34, 2, 3};
        int num_even = 0, num_odd = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                num_even += 1;
                System.out.println(x + " is even");
            } else {
                num_odd += 1;
                System.out.println(x + " is odd");
            }
        }
        System.out.println("the count of even numbers " + num_even);
        System.out.println("the count of odd numbers " + num_odd);
        int sum_array = 0;
        for (int x : array) {
            sum_array += x;
        }
        System.out.println("the middle value of array " + (sum_array / array.length));
        System.out.println("the summ of elements " + sum_array);
        System.out.println("the first element of array " + array[0]);
        System.out.println("the last element of array " + array[array.length - 1]);
        if (array.length % 2 != 0) {
            System.out.println("the middle element " + array[(array.length) / 2]);
        } else {
            System.out.println("the middle element " + array[(array.length - 1) / 2]);
        }
    }
}
