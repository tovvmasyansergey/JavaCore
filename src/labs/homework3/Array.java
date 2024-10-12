package labs.homework3;

import java.util.Arrays;

public class Array {
    //    private int tos = -1;
    //   private int[] arr = new int[10];
    //  private int size = 0;
    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void create2dArray(int x, int y) {
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = i * y + j + 1;
            }
        }
        System.out.println("2D Array : ");
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = valueToAdd;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }
    public static boolean contains(int[] array,int value){
        for (int i : array) {
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static int indexOf(int[] array,int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}

