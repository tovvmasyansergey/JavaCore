package homework.homework6;

public class ArrayUtil {
    void printAllElements(int[] array) {
        for (int x : array) {
            System.out.print(x);
            if (x == array[array.length - 1]) {
                System.out.print(':');
            } else {
                System.out.print(',');
            }
        }
    }

    void maxElement(int[] array) {
        int maxElement = array[0];
        for (int x : array) {
            if (x > maxElement) {
                maxElement = x;
            }
        }
        System.out.println(maxElement);
    }

    void minElement(int[] array) {
        int minElement = array[0];
        for (int x : array) {
            if (x < minElement) {
                minElement = x;
            }
        }
        System.out.println(minElement);
    }

    void evenElements(int[] array) {
        boolean comma = true;
        for (int x : array) {
            if (x % 2 == 0) {
                if (!comma) {
                    System.out.print(',');
                }
                System.out.print(x);
                comma = false;
            }
        }
        System.out.print('.');
    }

    void oddElements(int[] array) {
        boolean comma = true;
        for (int x : array) {
            if (x % 2 != 0) {
                if (!comma) {
                    System.out.print(',');
                }
                System.out.print(x);
                comma = false;
            }
        }
        System.out.print('.');
    }

    void countEvenElements(int[] array) {
        int countEvenElements = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                countEvenElements++;
            }
        }
        System.out.println();
        System.out.println(countEvenElements);
    }
    void countOddElements(int[] array) {
        int countOddElements = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                countOddElements++;
            }
        }
        System.out.println(countOddElements);
    }
    void middleElements(int[] array){
        int sumElements = 0;
        for (int x : array){
            sumElements += x;
        }
        System.out.println(sumElements/array.length);
    }
    void sumElement(int[] array){
        int sumElements = 0;
        for (int x : array){
            sumElements += x;
        }
        System.out.println(sumElements);
    }
    void firstElement(int[] array){
        System.out.println(array[0]);
    }
    void lastElement(int[] array){
        System.out.println(array[array.length - 1]);
    }
    void midElement(int[] array){
        System.out.println(array[array.length/2]);
    }
}