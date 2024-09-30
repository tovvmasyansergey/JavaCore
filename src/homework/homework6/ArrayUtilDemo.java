package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3,4,4,7,2,10,-3};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printAllElements(array);
        System.out.println();
        arrayUtil.maxElement(array);
        arrayUtil.minElement(array);
        arrayUtil.evenElements(array);
        System.out.println();
        arrayUtil.oddElements(array);
        arrayUtil.countEvenElements(array);
        arrayUtil.countOddElements(array);
        arrayUtil.middleElements(array);
        arrayUtil.sumElement(array);
        arrayUtil.firstElement(array);
        arrayUtil.lastElement(array);
        arrayUtil.midElement(array);
    }

}
