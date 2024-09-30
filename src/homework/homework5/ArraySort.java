package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 35, 4, -5, 4, 0};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int[] number = {3, 4, 0, 0, -30, 34, 90, 5};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] < number[j + 1]) {
                    int temp = number[j+1];
                    number[j+1] = number[j];
                    number[j] = temp;
                }
            }

        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
    }
}
