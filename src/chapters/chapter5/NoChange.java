package chapters.chapter5;

public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        for (int x : nums){
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();
        for (int x : nums){
            System.out.print(x + " ");
        }
    }
}
