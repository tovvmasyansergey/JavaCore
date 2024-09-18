package chapters.chapter4;

public class ModExample {
    public static void main(String[] args) {
        int[] array = {0,1, 2, 3, 4, 5, 6};
        for (int x : array) {
            if (x % 2 == 0){
                System.out.println(x + " is even");
            }else {
                System.out.println(x + " is odd");
            }
        }
    }
}
