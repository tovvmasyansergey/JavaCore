package chapters.chapter5;

public class Search {
    public static void main(String[] args) {
        int nums[]  = {1,2,3,4,5,6,7};
        int val = 5;
        boolean found = false;
        for (int x : nums){
            if (x == val){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("fonded");
        }else {
            System.out.println("not founded");
        }
    }
}
