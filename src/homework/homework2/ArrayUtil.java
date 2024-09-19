package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2,5,8,10,32,22,11,6,12,30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max_num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_num){
                max_num = array[i];
            }
        }
        int min_num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min_num){
                min_num = array[i];
            }
        }
        System.out.println(min_num);
        System.out.println(max_num);
    }
}
